
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
    
    public void activarDisplay1(){
        ImagenMascota1.setVisible(true);
        NombreMascota1.setVisible(true);
        pesoLabel1.setVisible(true);
        alturaLabel1.setVisible(true);
        comentarioLabel1.setVisible(true);
        }
    public void activarDisplay2(){
        ImagenMascota2.setVisible(true);
        NombreMascota2.setVisible(true);
        pesoLabel2.setVisible(true);
        alturaLabel2.setVisible(true);
        comentarioLabel2.setVisible(true);
    }
    public void activarDisplay3(){
        ImagenMascota3.setVisible(true);
        NombreMascota3.setVisible(true);
        pesoLabel3.setVisible(true);
        alturaLabel3.setVisible(true);
        comentarioLabel3.setVisible(true);
        }
    public void activarDisplay4(){
        ImagenMascota4.setVisible(true);
        NombreMascota4.setVisible(true);
        pesoLabel4.setVisible(true);
        alturaLabel4.setVisible(true);
        comentarioLabel4.setVisible(true);
    }
    public void desactivarTodoDisplay(){
        ImagenMascota1.setVisible(false);
        ImagenMascota2.setVisible(false);
        ImagenMascota3.setVisible(false);
        ImagenMascota4.setVisible(false);
          NombreMascota1.setVisible(false);
        pesoLabel1.setVisible(false);
        alturaLabel1.setVisible(false);
        comentarioLabel1.setVisible(false);
        NombreMascota2.setVisible(false);
        pesoLabel2.setVisible(false);
        alturaLabel2.setVisible(false);
        comentarioLabel2.setVisible(false);
         NombreMascota3.setVisible(false);
        pesoLabel3.setVisible(false);
        alturaLabel3.setVisible(false);
        comentarioLabel3.setVisible(false);
        NombreMascota4.setVisible(false);
        pesoLabel4.setVisible(false);
        alturaLabel4.setVisible(false);
        comentarioLabel4.setVisible(false);
    }
    public VentanaPrincipal(Sistema modelo) {
        initComponents();
        sistema = modelo;      
        setLocationRelativeTo(null); 
        //configuro usuario
        username = sistema.getUsuarioSeleccionado();
        UsernameLabel.setText(username.getNombre());
        if (username.getFoto()!=null){
        rsscalelabel.RSScaleLabel.setScaleLabel(ImagenUsuario, username.getFoto().toString());
        }
        pesoUser.setText(username.getPeso()+" Kg");
        alturaUser.setText(username.getAltura()+" Cm");
        comentario.setText(username.getComentario());
        //configuro mascota
        int numeroMascotas = sistema.getListaMascotas().size();
        //porque se muestran las 4 primeras
        if (numeroMascotas > 4) {
            numeroMascotas = 4;
        }
        desactivarTodoDisplay();
        
        switch (numeroMascotas) {
            case 1:          
                activarDisplay1();
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota1, 
                        sistema.getListaMascotas().get(0).getFoto().toString());
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso())+" Kg");
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura())+" Cm");
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                break;
            case 2:
                activarDisplay1();
                activarDisplay2();
                //mascota1
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota1, 
                        sistema.getListaMascotas().get(0).getFoto().toString());
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso())+" Kg");
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura())+" Cm");
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota2, 
                        sistema.getListaMascotas().get(1).getFoto().toString());
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso())+" Kg");
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura())+" Cm");
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                break;
            case 3:
                 activarDisplay1();
                activarDisplay2();
                activarDisplay3();
                //mascota1
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota1, 
                        sistema.getListaMascotas().get(0).getFoto().toString());
               NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso())+" Kg");
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura())+" Cm");
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota2, 
                        sistema.getListaMascotas().get(1).getFoto().toString());
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso())+" Kg");
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura())+" Cm");
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                //mascota 3
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota3, 
                        sistema.getListaMascotas().get(2).getFoto().toString());
                NombreMascota3.setText(sistema.getListaMascotas().get(2).getNombre());
                pesoLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getPeso())+" Kg");
                alturaLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getAltura())+" Cm");
                comentarioLabel3.setText(sistema.getListaMascotas().get(2).getComentario());
                break;
            case 4:
                 activarDisplay1();
                activarDisplay2();
                activarDisplay3();
                activarDisplay4();
                 //mascota1
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota1, 
                        sistema.getListaMascotas().get(0).getFoto().toString());
                NombreMascota1.setText(sistema.getListaMascotas().get(0).getNombre());
                pesoLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getPeso())+" Kg");
                alturaLabel1.setText(String.valueOf(sistema.getListaMascotas().get(0).getAltura())+" Cm");
                comentarioLabel1.setText(sistema.getListaMascotas().get(0).getComentario());
                //mascota 2
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota2, 
                        sistema.getListaMascotas().get(1).getFoto().toString());
                NombreMascota2.setText(sistema.getListaMascotas().get(1).getNombre());
                pesoLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getPeso())+" Kg");
                alturaLabel2.setText(String.valueOf(sistema.getListaMascotas().get(1).getAltura())+" Cm");
                comentarioLabel2.setText(sistema.getListaMascotas().get(1).getComentario());
                //mascota 3
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota3, 
                        sistema.getListaMascotas().get(2).getFoto().toString());
                   NombreMascota3.setText(sistema.getListaMascotas().get(2).getNombre());
                pesoLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getPeso())+" Kg");
                alturaLabel3.setText(String.valueOf(sistema.getListaMascotas().get(2).getAltura())+" Cm");
                comentarioLabel3.setText(sistema.getListaMascotas().get(2).getComentario());
                //mascota 4
                rsscalelabel.RSScaleLabel.setScaleLabel(ImagenMascota4, 
                        sistema.getListaMascotas().get(3).getFoto().toString());
                NombreMascota4.setText(sistema.getListaMascotas().get(3).getNombre());
                pesoLabel4.setText(String.valueOf(sistema.getListaMascotas().get(3).getPeso())+" Kg");
                alturaLabel4.setText(String.valueOf(sistema.getListaMascotas().get(3).getAltura())+" Cm");
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
        pesoUser = new javax.swing.JLabel();
        alturaUser = new javax.swing.JLabel();
        comentario = new javax.swing.JLabel();
        ImagenMascota2 = new javax.swing.JLabel();
        borrarMascotaBoton = new javax.swing.JButton();
        PanelSostieneInfo = new javax.swing.JPanel();
        perfilSeleccionBoton = new javax.swing.JButton();
        registrarMascota = new javax.swing.JButton();
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
        pesoLabel1.setBounds(90, 300, 80, 14);

        alturaLabel1.setText("altura cm");
        jPanel1.add(alturaLabel1);
        alturaLabel1.setBounds(90, 320, 70, 14);

        ImagenMascota1.setText("IMAGEN");
        jPanel1.add(ImagenMascota1);
        ImagenMascota1.setBounds(110, 210, 60, 50);

        NombreMascota2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota2.setText("Nombre mascota 2");
        jPanel1.add(NombreMascota2);
        NombreMascota2.setBounds(240, 260, 120, 30);

        pesoLabel2.setText("peso kg");
        jPanel1.add(pesoLabel2);
        pesoLabel2.setBounds(240, 300, 90, 14);

        comentarioLabel2.setText("Comentario");
        jPanel1.add(comentarioLabel2);
        comentarioLabel2.setBounds(240, 340, 100, 14);

        alturaLabel2.setText("altura cm");
        jPanel1.add(alturaLabel2);
        alturaLabel2.setBounds(240, 320, 80, 14);

        NombreMascota3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        NombreMascota3.setText("Nombre mascota 3");
        jPanel1.add(NombreMascota3);
        NombreMascota3.setBounds(390, 260, 120, 30);

        pesoLabel3.setText("peso kg");
        jPanel1.add(pesoLabel3);
        pesoLabel3.setBounds(390, 300, 90, 14);

        alturaLabel3.setText("altura cm");
        jPanel1.add(alturaLabel3);
        alturaLabel3.setBounds(390, 320, 90, 14);

        comentarioLabel3.setText("Comentario");
        jPanel1.add(comentarioLabel3);
        comentarioLabel3.setBounds(390, 340, 100, 14);

        ImagenMascota3.setText("IMAGEN");
        jPanel1.add(ImagenMascota3);
        ImagenMascota3.setBounds(410, 210, 60, 50);

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
        ImagenMascota4.setBounds(550, 210, 60, 50);

        UsernameLabel.setBackground(new java.awt.Color(153, 153, 153));
        UsernameLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 0));
        UsernameLabel.setText("NOMBRE USUARIO");
        jPanel1.add(UsernameLabel);
        UsernameLabel.setBounds(40, 90, 140, 30);

        pesoUser.setBackground(new java.awt.Color(153, 153, 153));
        pesoUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pesoUser.setForeground(new java.awt.Color(255, 255, 0));
        pesoUser.setText("Peso");
        jPanel1.add(pesoUser);
        pesoUser.setBounds(40, 120, 140, 20);

        alturaUser.setBackground(new java.awt.Color(153, 153, 153));
        alturaUser.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        alturaUser.setForeground(new java.awt.Color(255, 255, 0));
        alturaUser.setText("Altura");
        jPanel1.add(alturaUser);
        alturaUser.setBounds(40, 140, 140, 30);

        comentario.setBackground(new java.awt.Color(153, 153, 153));
        comentario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        comentario.setForeground(new java.awt.Color(255, 255, 0));
        comentario.setText("Altura");
        jPanel1.add(comentario);
        comentario.setBounds(40, 170, 140, 30);

        ImagenMascota2.setText("IMAGEN");
        jPanel1.add(ImagenMascota2);
        ImagenMascota2.setBounds(260, 210, 60, 50);

        borrarMascotaBoton.setBackground(new java.awt.Color(255, 255, 255));
        borrarMascotaBoton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        borrarMascotaBoton.setText("Borrar Mascota");
        borrarMascotaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarMascotaBotonActionPerformed(evt);
            }
        });
        jPanel1.add(borrarMascotaBoton);
        borrarMascotaBoton.setBounds(410, 440, 120, 25);

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

        perfilSeleccionBoton.setBackground(new java.awt.Color(0, 204, 204));
        perfilSeleccionBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        perfilSeleccionBoton.setForeground(new java.awt.Color(255, 255, 0));
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
        calendarioBoton.setBounds(540, 100, 120, 30);

        ImagenUsuario.setText("Imagen Usuario ");
        jPanel1.add(ImagenUsuario);
        ImagenUsuario.setBounds(40, 20, 110, 70);

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

    private void borrarMascotaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarMascotaBotonActionPerformed
        BorrarMascota bm = new BorrarMascota(sistema);
        bm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_borrarMascotaBotonActionPerformed

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
    private javax.swing.JLabel alturaLabel1;
    private javax.swing.JLabel alturaLabel2;
    private javax.swing.JLabel alturaLabel3;
    private javax.swing.JLabel alturaLabel4;
    private javax.swing.JLabel alturaUser;
    private javax.swing.JButton borrarMascotaBoton;
    private javax.swing.JButton calendarioBoton;
    private javax.swing.JLabel comentario;
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
    private javax.swing.JLabel pesoUser;
    private javax.swing.JButton registrarMascota;
    // End of variables declaration//GEN-END:variables
}

