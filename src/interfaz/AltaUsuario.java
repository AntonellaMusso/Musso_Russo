/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Image;
import javax.swing.ImageIcon;
import mascota.Familiar;
import mascota.Mascota;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class AltaUsuario extends javax.swing.JFrame {

    static Sistema sistema;
    public AltaUsuario(Sistema modelo) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Titulo = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        FotoLabel = new javax.swing.JLabel();
        AlturaLabel = new javax.swing.JLabel();
        AlturaText = new javax.swing.JTextField();
        comentariosLabel = new javax.swing.JLabel();
        pesoText = new javax.swing.JTextField();
        kgLabel = new javax.swing.JLabel();
        cmLabel = new javax.swing.JLabel();
        AddFotoBoton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoAreaComentario = new javax.swing.JTextArea();
        cancelarBoton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setBackground(new java.awt.Color(204, 204, 255));
        Titulo.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 153, 153));
        Titulo.setText("Registrar Usuario");

        BotonRegistrar.setBackground(new java.awt.Color(204, 255, 255));
        BotonRegistrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(0, 153, 153));
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        FotoLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        FotoLabel.setText("Foto");

        AlturaLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AlturaLabel.setText("Altura");

        AlturaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaTextActionPerformed(evt);
            }
        });

        comentariosLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        comentariosLabel.setText("Comentario");

        pesoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTextActionPerformed(evt);
            }
        });

        kgLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        kgLabel.setText("Kg");

        cmLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cmLabel.setText("Cm");

        AddFotoBoton.setText("+");
        AddFotoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFotoBotonActionPerformed(evt);
            }
        });

        NombreLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        NombreLabel.setText("Nombre");

        pesoLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        pesoLabel.setText("Peso");

        textoAreaComentario.setColumns(20);
        textoAreaComentario.setRows(5);
        jScrollPane2.setViewportView(textoAreaComentario);

        cancelarBoton.setText("Cancelar");
        cancelarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombreLabel)
                                    .addComponent(comentariosLabel)
                                    .addComponent(pesoLabel)
                                    .addComponent(AlturaLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(FotoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AlturaText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(pesoText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kgLabel)
                                    .addComponent(cmLabel)))
                            .addComponent(AddFotoBoton)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(Titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(cancelarBoton)
                                .addGap(190, 190, 190)
                                .addComponent(BotonRegistrar)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FotoLabel)
                    .addComponent(AddFotoBoton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlturaLabel)
                    .addComponent(AlturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kgLabel)
                    .addComponent(pesoLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comentariosLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar)
                    .addComponent(cancelarBoton))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String nombre = NombreText.getText();
        int altura = Integer.parseInt(AlturaText.getText());
        int peso = Integer.parseInt(pesoText.getText());
        String comentario = textoAreaComentario.getText();
        ImageIcon imagen = null; // arreglar despues             
        Familiar usuario = new Familiar(nombre,altura,peso,comentario,imagen); 
        sistema.agregoFamiliarALista(usuario);
        //ahora abrimos la ventana de perfiles
        Perfiles perfiles = new Perfiles(sistema);
        perfiles.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void AlturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlturaTextActionPerformed

    private void pesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTextActionPerformed

    private void AddFotoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFotoBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddFotoBotonActionPerformed

    private void cancelarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotonActionPerformed
        Perfiles perfiles = new Perfiles(sistema);    
        perfiles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaUsuario(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFotoBoton;
    private javax.swing.JLabel AlturaLabel;
    private javax.swing.JTextField AlturaText;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel FotoLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton cancelarBoton;
    private javax.swing.JLabel cmLabel;
    private javax.swing.JLabel comentariosLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel kgLabel;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoText;
    private javax.swing.JTextArea textoAreaComentario;
    // End of variables declaration//GEN-END:variables
}
