/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static interfaz.Perfiles.sistema;
import java.util.Date;
import javax.swing.JOptionPane;
import mascota.Mascota;
import mascota.Servicio;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class Veterinaria extends javax.swing.JFrame {

    static Sistema sistema;
    Date fecha;
    public Veterinaria(Sistema modelo,Date date) {
        initComponents();
        sistema = modelo;
        setLocationRelativeTo(null); 
        //inicializo la lista de mascotas
          String[] selections = new String[sistema.getListaMascotas().size()];
        for (int i = 0; i < sistema.getListaMascotas().size(); i++) {
            selections[i] = sistema.getListaMascotas().get(i).getNombre();
        }
        listaMascotas.setListData(selections);
        fecha = date;
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        atrasBoton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMascotas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        registrarBoton = new javax.swing.JButton();
        nameBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        servicioBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Lista Mascotas");

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        listaMascotas.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        listaMascotas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaMascotas);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Registro de Servicio");

        registrarBoton.setText("Registrar");
        registrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBotonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Nombre Veterinario");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(atrasBoton)
                        .addGap(219, 219, 219)
                        .addComponent(registrarBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(servicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel2)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(registrarBoton)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atrasBoton)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addContainerGap(416, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBotonActionPerformed

    private void registrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBotonActionPerformed
        Mascota m = sistema.getMascotaPorNombre(listaMascotas.getSelectedValue());
        String nombreVet = nameBox.getText();
        String servicio = servicioBox.getText();
        // si los campos no estan vacios procedo
        if (m != null && nombreVet!= null && servicio != null){
        Servicio s = new Servicio(m,nombreVet,servicio,fecha);
        sistema.agregoServicioALista(s);
         Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Hay campos sin rellenar");
        }
       
    }//GEN-LAST:event_registrarBotonActionPerformed

  

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMascotas;
    private javax.swing.JTextField nameBox;
    private javax.swing.JButton registrarBoton;
    private javax.swing.JTextField servicioBox;
    // End of variables declaration//GEN-END:variables
}
