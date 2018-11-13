/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import mascota.Familiar;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class Perfiles extends javax.swing.JFrame {

    static Sistema sistema;
    private Familiar usuario;
    public Perfiles(Sistema modelo) {
        initComponents();
        sistema = modelo;   
         String[] selections = new String[sistema.getListaFamiliares().size()];
        for (int i = 0; i < sistema.getListaFamiliares().size(); i++) {
            selections[i] = sistema.getListaFamiliares().get(i).getNombre();
        }
        lista.setListData(selections);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        titulo = new javax.swing.JLabel();
        ingresarBoton = new javax.swing.JButton();
        regsitrarBoton = new javax.swing.JButton();
        actualizarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lista.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        titulo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        titulo.setText("Seleccion de Perfiles");

        ingresarBoton.setText("Ingresar");
        ingresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBotonActionPerformed(evt);
            }
        });

        regsitrarBoton.setText("Registrar Usuario");
        regsitrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regsitrarBotonActionPerformed(evt);
            }
        });

        actualizarBoton.setText("Actualizar");
        actualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actualizarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(255, 255, 255))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regsitrarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actualizarBoton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresarBoton)
                    .addComponent(regsitrarBoton))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBotonActionPerformed
        usuario = sistema.getUsuarioSeleccionadoPorNombre(lista.getSelectedValue());
        if (usuario != null){
        sistema.setUsuarioSeleccionado(usuario);
        VentanaPrincipal ventanaCentral = new VentanaPrincipal(sistema);
        ventanaCentral.setVisible(true);
        this.setVisible(false);    
        }else{
            JOptionPane.showMessageDialog(null, "No hay ningun usuario seleccionado");
        }
    }//GEN-LAST:event_ingresarBotonActionPerformed

    private void regsitrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regsitrarBotonActionPerformed
        AltaUsuario registro = new AltaUsuario(sistema);
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regsitrarBotonActionPerformed

    private void actualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBotonActionPerformed
        String[] selections = new String[sistema.getListaFamiliares().size()];
        for (int i = 0; i < sistema.getListaFamiliares().size(); i++) {
            selections[i] = sistema.getListaFamiliares().get(i).getNombre();
        }
        lista.setListData(selections);

    }//GEN-LAST:event_actualizarBotonActionPerformed

 
    
    
    
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
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfiles(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarBoton;
    private javax.swing.JButton ingresarBoton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton regsitrarBoton;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
