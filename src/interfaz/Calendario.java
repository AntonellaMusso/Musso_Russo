/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import mascota.Actividad;
import mascota.Alimento;
import mascota.Paseo;
import mascota.Sistema;

/**
 *
 * @author usuario
 */
public class Calendario extends javax.swing.JFrame {

    static Sistema sistema;

    public Calendario(Sistema modelo) {
        initComponents();
        sistema = modelo;
        hayEventosLosDiasLabel.setVisible(false);
        linea1Label.setVisible(false);
        AlimentacionLabel.setVisible(false);
        paseosLabel.setVisible(false);
        actividadLabel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasBoton = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        eventosDiaBoton = new javax.swing.JButton();
        linea1Label = new javax.swing.JLabel();
        hayEventosLosDiasLabel = new javax.swing.JLabel();
        actPeriodicaBoton = new javax.swing.JButton();
        AlimentacionLabel = new javax.swing.JLabel();
        paseosLabel = new javax.swing.JLabel();
        actividadLabel = new javax.swing.JLabel();
        actividadRegBoton = new javax.swing.JButton();
        eventosDiaBoton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        eventosDiaBoton.setText("Ver eventos del dia");
        eventosDiaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosDiaBotonActionPerformed(evt);
            }
        });

        linea1Label.setText("1,2,3,4,5,6,7,8,9,10");

        hayEventosLosDiasLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        hayEventosLosDiasLabel.setText("Hay eventos los dias");

        actPeriodicaBoton.setText("Responsable actividad periodica");
        actPeriodicaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actPeriodicaBotonActionPerformed(evt);
            }
        });

        AlimentacionLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        AlimentacionLabel.setText("Alimentacion");

        paseosLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        paseosLabel.setText("Paseos");

        actividadLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        actividadLabel.setText("Actividad");

        actividadRegBoton.setText("Registrar una actividad Realizada");
        actividadRegBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actividadRegBotonActionPerformed(evt);
            }
        });

        eventosDiaBoton1.setText("Ver dias con eventos");
        eventosDiaBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosDiaBoton1ActionPerformed(evt);
            }
        });

        jButton1.setText("ver  todo listas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(atrasBoton)
                        .addGap(92, 92, 92)
                        .addComponent(actPeriodicaBoton)
                        .addGap(18, 18, 18)
                        .addComponent(actividadRegBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hayEventosLosDiasLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(eventosDiaBoton1)
                                .addGap(18, 18, 18)
                                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(actividadLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paseosLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AlimentacionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linea1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eventosDiaBoton)
                            .addComponent(jButton1))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventosDiaBoton)
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventosDiaBoton1))
                .addGap(13, 13, 13)
                .addComponent(hayEventosLosDiasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlimentacionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paseosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actividadLabel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atrasBoton)
                    .addComponent(actPeriodicaBoton)
                    .addComponent(actividadRegBoton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBotonActionPerformed


    private void eventosDiaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosDiaBotonActionPerformed
        Date fechaSelected = calendario.getDate();

    }//GEN-LAST:event_eventosDiaBotonActionPerformed

    private void actPeriodicaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actPeriodicaBotonActionPerformed

        registroActividadPeriodica rg = new registroActividadPeriodica(sistema, calendario.getDate());
        rg.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_actPeriodicaBotonActionPerformed

    private void actividadRegBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actividadRegBotonActionPerformed
        Calendar cal = Calendar.getInstance();
          RegsitroActividad ra;
        if (!sistema.fechasIguales(calendario.getDate(), cal.getTime())) {
            System.out.println("No son iguales");
            Date menorFecha = null;
            menorFecha = sistema.fechaMenor(calendario.getDate(), cal.getTime());
            if (sistema.fechasIguales(menorFecha, calendario.getDate())) {
               ra = new RegsitroActividad(sistema, calendario.getDate());
                ra.setVisible(true);
                this.setVisible(false);
            } else {
                //abrir un panel con el error de no poder registrar en futuro
                JOptionPane.showMessageDialog(null, "No es posible registrar recordatorios en dias futuros");
            }
        } else {
            //son el mismo dia asi que se peude
            System.out.println("Son el mismo dia");
             ra = new RegsitroActividad(sistema, calendario.getDate());
            ra.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_actividadRegBotonActionPerformed

    private void eventosDiaBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosDiaBoton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventosDiaBoton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (int i = 0; i < sistema.getListaActividades().size(); i++) {
            Actividad act = sistema.getListaActividades().get(i);
            System.out.println(act.toString());
        }
        for (int i = 0; i < sistema.getListaAlimentos().size(); i++) {
            Alimento a = sistema.getListaAlimentos().get(i);
        }
        for (int i = 0; i < sistema.getListadoPaseos().size(); i++) {
            Paseo p = sistema.getListadoPaseos().get(i);
            System.out.println(p);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario(sistema).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentacionLabel;
    private javax.swing.JButton actPeriodicaBoton;
    private javax.swing.JLabel actividadLabel;
    private javax.swing.JButton actividadRegBoton;
    private javax.swing.JButton atrasBoton;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JButton eventosDiaBoton;
    private javax.swing.JButton eventosDiaBoton1;
    private javax.swing.JLabel hayEventosLosDiasLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel linea1Label;
    private javax.swing.JLabel paseosLabel;
    // End of variables declaration//GEN-END:variables
}
