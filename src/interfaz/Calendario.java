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
import mascota.Servicio;
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
        setLocationRelativeTo(null); 
        hayEventosLosDiasLabel.setVisible(false);
        diasLabel.setVisible(false);

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasBoton = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        eventosDiaBoton = new javax.swing.JButton();
        diasLabel = new javax.swing.JLabel();
        hayEventosLosDiasLabel = new javax.swing.JLabel();
        actPeriodicaBoton = new javax.swing.JButton();
        actividadRegBoton = new javax.swing.JButton();
        eventosDiaBoton1 = new javax.swing.JButton();
        borrarActividad = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        eventosDiaBoton.setBackground(new java.awt.Color(153, 153, 153));
        eventosDiaBoton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        eventosDiaBoton.setForeground(new java.awt.Color(204, 255, 255));
        eventosDiaBoton.setText("Ver eventos del dia");
        eventosDiaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosDiaBotonActionPerformed(evt);
            }
        });

        diasLabel.setText("[");

        hayEventosLosDiasLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        hayEventosLosDiasLabel.setText("Hay eventos los dias");

        actPeriodicaBoton.setText("Responsable actividad periodica");
        actPeriodicaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actPeriodicaBotonActionPerformed(evt);
            }
        });

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

        borrarActividad.setText("Borrar una actividad");
        borrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActividadActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/veterinaria.jpg"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hayEventosLosDiasLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(eventosDiaBoton1)
                .addGap(18, 18, 18)
                .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(eventosDiaBoton)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(atrasBoton)
                .addGap(92, 92, 92)
                .addComponent(actPeriodicaBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actividadRegBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(borrarActividad)
                .addGap(256, 256, 256))
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
                .addComponent(diasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrarActividad)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        MuestraActividadesInterfaz muestra;
        muestra = new MuestraActividadesInterfaz(sistema, fechaSelected);
        muestra.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_eventosDiaBotonActionPerformed

    private void actPeriodicaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actPeriodicaBotonActionPerformed
        registroActividadPeriodica rg;
        rg = new registroActividadPeriodica(sistema, calendario.getDate());
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
        boolean arrayDias[] = new boolean[32];
        for (int i = 0; i < sistema.getListaActividades().size(); i++) {
           Actividad act = sistema.getListaActividades().get(i);
           if (sistema.getMes(act.getFecha()) == (sistema.getMes(calendario.getDate()))
                   && act.getFecha().getYear() == calendario.getDate().getYear()){
               arrayDias[act.getFecha().getDate()] = true;
           }
        }//termina el recorrido de actividades
        for (int i = 0; i < sistema.getListadoAlimento().size(); i++) {
           Alimento al = sistema.getListaAlimentos().get(i);
           if (sistema.getMes(al.getFecha()) == (sistema.getMes(calendario.getDate()))
                   && al.getFecha().getYear() == calendario.getDate().getYear()){
               arrayDias[al.getFecha().getDate()] = true;
           }
        }//termina el recorrido de alimentos
        for (int i = 0; i < sistema.getListadoPaseos().size(); i++) {
           Paseo paseo = sistema.getListadoPaseos().get(i);
           if (sistema.getMes(paseo.getFecha()) == (sistema.getMes(calendario.getDate()))
                   && paseo.getFecha().getYear() == calendario.getDate().getYear()){
               arrayDias[paseo.getFecha().getDate()] = true;
           }
        }//termina el recorrido de Paseos      
         for (int i = 0; i < sistema.getListaServicios().size(); i++) {
           Servicio s = sistema.getListaServicios().get(i);
           if (sistema.getMes(s.getFecha()) == (sistema.getMes(calendario.getDate()))
                   && s.getFecha().getYear() == calendario.getDate().getYear()){
               arrayDias[s.getFecha().getDate()] = true;
           }
        }             
        for (int i = 0; i < arrayDias.length; i++) {
            if (arrayDias[i]){
                diasLabel.setVisible(true);
                diasLabel.setText(diasLabel.getText()+" "+i);
            }
        }
        diasLabel.setText(diasLabel.getText()+"]");
        
    }//GEN-LAST:event_eventosDiaBoton1ActionPerformed

    private void borrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActividadActionPerformed
        BorrarActividad ba = new BorrarActividad(sistema, calendario.getDate());
        ba.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_borrarActividadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Veterinaria v = new Veterinaria(sistema,calendario.getDate());
        v.setVisible(true);
        this.setVisible(false);
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
    private javax.swing.JButton actPeriodicaBoton;
    private javax.swing.JButton actividadRegBoton;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JButton borrarActividad;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel diasLabel;
    private javax.swing.JButton eventosDiaBoton;
    private javax.swing.JButton eventosDiaBoton1;
    private javax.swing.JLabel hayEventosLosDiasLabel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
