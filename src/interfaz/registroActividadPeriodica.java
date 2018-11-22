/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static interfaz.Perfiles.sistema;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import mascota.Alimento;
import mascota.Familiar;
import mascota.Mascota;
import mascota.Paseo;
import mascota.Sistema;

/**
 *
 * @author Emiliano
 */
public class registroActividadPeriodica extends javax.swing.JFrame {

    Sistema sistema;
    Date fechaInicio;
    int mes;
    boolean paseo = false;
    boolean alimento = false;

    public registroActividadPeriodica(Sistema modelo, Date date) {
        initComponents();
        sistema = modelo;
        setLocationRelativeTo(null);
        fechaInicio = date;
        mes = sistema.conversionMesANumero(date.toString().substring(4, 7));
        //para rellenar lista familiares
        String[] selections = new String[sistema.getListaFamiliares().size()];
        for (int i = 0; i < sistema.getListaFamiliares().size(); i++) {
            selections[i] = sistema.getListaFamiliares().get(i).getNombre();
        }
        familiarList.setListData(selections);
        //para rellenar lista mascotas
        String[] selecciones = new String[sistema.getListaMascotas().size()];
        for (int i = 0; i < sistema.getListaMascotas().size(); i++) {
            selecciones[i] = sistema.getListaMascotas().get(i).getNombre();
        }
        mascotaList.setListData(selecciones);
        alimentoLabel.setVisible(false);
        alimentoText.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mascotaLabel = new javax.swing.JLabel();
        esPaseo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        mascotaList = new javax.swing.JList<>();
        titulo = new javax.swing.JLabel();
        familiarLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        familiarList = new javax.swing.JList<>();
        registrar = new javax.swing.JButton();
        esAlimentacion = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        diferenciaDias = new javax.swing.JTextField();
        atras = new javax.swing.JButton();
        alimentoLabel = new javax.swing.JLabel();
        alimentoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mascotaLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        mascotaLabel.setText("Mascota");

        esPaseo.setText("Es Paseo");
        esPaseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esPaseoActionPerformed(evt);
            }
        });

        mascotaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(mascotaList);

        titulo.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        titulo.setText("Registro Actividad Periodica");

        familiarLabel.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        familiarLabel.setText("Familiar");

        familiarList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(familiarList);

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        esAlimentacion.setText("Es alimentacion");
        esAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esAlimentacionActionPerformed(evt);
            }
        });

        jLabel1.setText("Cada cuantos dias");

        diferenciaDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diferenciaDiasKeyTyped(evt);
            }
        });

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        alimentoLabel.setText("Alimento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(mascotaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atras)
                                .addGap(134, 134, 134)
                                .addComponent(registrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(esPaseo)
                                .addGap(18, 18, 18)
                                .addComponent(esAlimentacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(alimentoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diferenciaDias, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(470, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(176, 176, 176)
                    .addComponent(titulo)
                    .addContainerGap(200, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(familiarLabel)
                    .addContainerGap(641, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(609, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esAlimentacion)
                    .addComponent(esPaseo))
                .addGap(18, 18, 18)
                .addComponent(mascotaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(diferenciaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar)
                            .addComponent(atras)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alimentoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alimentoLabel)))
                .addGap(40, 40, 40))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(titulo)
                    .addContainerGap(445, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(familiarLabel)
                    .addContainerGap(368, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        if (paseo != alimento) {
            //listo para crearla  
            int cadaCuanto = 0;
            if (!diferenciaDias.getText().isEmpty()) {
                if (paseo) {
                    Familiar persona;
                    Mascota mascota;
                    persona = sistema.getUsuarioSeleccionadoPorNombre(familiarList.getSelectedValue());
                    mascota = sistema.getMascotaPorNombre(mascotaList.getSelectedValue());
                    cadaCuanto = Integer.parseInt(diferenciaDias.getText());
                    Date fecha = fechaInicio;
                    while (sistema.getMes(fecha) == mes) {
                        //1) registro
                        //2) sumo
                        Paseo paseo = new Paseo(persona, mascota, fecha);
                        sistema.getListadoPaseos().add(paseo);
                        fecha = sistema.sumarDiasAFecha(fecha, cadaCuanto, 
                                sistema.ultimoDiaDelMes(sistema.getMes(fecha)));
                    }
                } else if (alimento) {
                    Familiar persona;
                    Mascota mascota;
                    persona = sistema.getUsuarioSeleccionadoPorNombre(familiarList.getSelectedValue());
                    mascota = sistema.getMascotaPorNombre(mascotaList.getSelectedValue());
                    Date fecha = fechaInicio;
                    cadaCuanto = Integer.parseInt(diferenciaDias.getText());
                    while (sistema.getMes(fecha) == mes) {
                        //1) registro
                        //2) sumo
                        Alimento alimento = new Alimento(persona, mascota, fecha, 
                                alimentoText.getText());
                        sistema.getListaAlimentos().add(alimento);
                        fecha = sistema.sumarDiasAFecha(fecha, cadaCuanto, 
                                sistema.ultimoDiaDelMes(sistema.getMes(fecha)));
                    }
                }
            JOptionPane.showMessageDialog(null, "Actividad periódica registrada con éxito!");
            Calendario c = new Calendario(sistema);
            c.setVisible(true);
            this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Campos sin completar");
            }
           
        } else {
            //avisar por ventana que son iguales
            JOptionPane.showMessageDialog(null, "No pueden haber 2 selecciones "
                    + "o 2 sin seleccionar");
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void esPaseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esPaseoActionPerformed
        paseo = !paseo;
    }//GEN-LAST:event_esPaseoActionPerformed

    private void esAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esAlimentacionActionPerformed
        alimento = !alimento;
        if (alimento) {
            alimentoLabel.setVisible(true);
            alimentoText.setVisible(true);
        } else {
            alimentoLabel.setVisible(false);
            alimentoText.setVisible(false);
        }

    }//GEN-LAST:event_esAlimentacionActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void diferenciaDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diferenciaDiasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE
                || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_diferenciaDiasKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alimentoLabel;
    private javax.swing.JTextField alimentoText;
    private javax.swing.JButton atras;
    private javax.swing.JTextField diferenciaDias;
    private javax.swing.JCheckBox esAlimentacion;
    private javax.swing.JCheckBox esPaseo;
    private javax.swing.JLabel familiarLabel;
    private javax.swing.JList<String> familiarList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mascotaLabel;
    private javax.swing.JList<String> mascotaList;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
