/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Date;
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
        unoAlDiez.setVisible(false);
        onceAlDiecisiete.setVisible(false);
        dieciochoAlVeinticuatro.setVisible(false);
        veinticincoAlTreintayuno.setVisible(false);

        visibilidadEventos(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atrasBoton = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JCalendar();
        eventoText = new javax.swing.JTextField();
        agregarEventoBoton = new javax.swing.JButton();
        borrarEventoBoton = new javax.swing.JButton();
        eventosDiaBoton = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        unoAlDiez = new javax.swing.JLabel();
        onceAlDiecisiete = new javax.swing.JLabel();
        dieciochoAlVeinticuatro = new javax.swing.JLabel();
        veinticincoAlTreintayuno = new javax.swing.JLabel();
        hayEventosLosDiasLabel = new javax.swing.JLabel();
        paseosBoton = new javax.swing.JButton();
        eventLabel1 = new javax.swing.JLabel();
        eventLabel2 = new javax.swing.JLabel();
        eventLabel3 = new javax.swing.JLabel();
        eventLabel4 = new javax.swing.JLabel();
        eventLabel5 = new javax.swing.JLabel();
        eventLabel6 = new javax.swing.JLabel();
        eventLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atrasBoton.setText("Atras");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        agregarEventoBoton.setText("Agregar Evento");
        agregarEventoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEventoBotonActionPerformed(evt);
            }
        });

        borrarEventoBoton.setText("Borrar Eventos");

        eventosDiaBoton.setText("Ver eventos del dia");
        eventosDiaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventosDiaBotonActionPerformed(evt);
            }
        });

        refresh.setText("Refrescar");

        unoAlDiez.setText("1,2,3,4,5,6,7,8,9,10");

        onceAlDiecisiete.setText("11,12,13,14,15,16,17");

        dieciochoAlVeinticuatro.setText("18,19,20,21,22,23,24");

        veinticincoAlTreintayuno.setText("25,26,27,28,29,30,31");

        hayEventosLosDiasLabel.setText("Hay eventos los dias");

        paseosBoton.setText("Asignar responsable de paseos");

        eventLabel1.setText("jLabel1");

        eventLabel2.setText("jLabel2");

        eventLabel3.setText("jLabel3");

        eventLabel4.setText("jLabel4");

        eventLabel5.setText("jLabel5");

        eventLabel6.setText("jLabel6");

        eventLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(refresh)
                                .addComponent(unoAlDiez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(onceAlDiecisiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dieciochoAlVeinticuatro)
                            .addComponent(veinticincoAlTreintayuno)
                            .addComponent(hayEventosLosDiasLabel))
                        .addGap(83, 83, 83)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventosDiaBoton)
                            .addComponent(eventLabel1)
                            .addComponent(eventLabel2)
                            .addComponent(eventLabel3)
                            .addComponent(eventLabel4)
                            .addComponent(eventLabel5)
                            .addComponent(eventLabel6)
                            .addComponent(eventLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atrasBoton)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregarEventoBoton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventoText, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(borrarEventoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paseosBoton)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refresh)
                        .addGap(27, 27, 27)
                        .addComponent(hayEventosLosDiasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unoAlDiez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(onceAlDiecisiete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dieciochoAlVeinticuatro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(veinticincoAlTreintayuno))
                    .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eventosDiaBoton)
                        .addGap(27, 27, 27)
                        .addComponent(eventLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarEventoBoton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(atrasBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(borrarEventoBoton)
                            .addComponent(paseosBoton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(sistema);
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasBotonActionPerformed

    public int conversionMesANumero(String mes) {
        int mesNumerico = 0;
        switch (mes) {
            case "Jan":
                mesNumerico = 1;
                break;
            case "Feb":
                mesNumerico = 2;
                break;
            case "Mar":
                mesNumerico = 3;
                break;
            case "Apr":
                mesNumerico = 4;
                break;
            case "May":
                mesNumerico = 5;
                break;
            case "Jun":
                mesNumerico = 6;
                break;
            case "Jul":
                mesNumerico = 7;
                break;
            case "Aug":
                mesNumerico = 8;
                break;
            case "Sep":
                mesNumerico = 9;
                break;
            case "Oct":
                mesNumerico = 10;
                break;
            case "Nov":
                mesNumerico = 11;
                break;
            case "Dec":
                mesNumerico = 12;
                break;
        }

        return mesNumerico;
    }

    public String conversionFecha(String fecha) {
        String aux = fecha.charAt(8) + "" + fecha.charAt(9)
                + "/"
                + conversionMesANumero("" + fecha.charAt(4) + fecha.charAt(5) + fecha.charAt(6))
                + "/" + fecha.charAt(24) + "" + fecha.charAt(25) + fecha.charAt(26) + fecha.charAt(27);
        return aux;
    }
    private void agregarEventoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEventoBotonActionPerformed
        String fecha = calendario.getDate().toString();
        String aux = conversionFecha(fecha);
        sistema.agregarEvento(aux + " " + eventoText.getText());
        System.out.println("Se agrego: " + aux + " " + eventoText.getText());

    }//GEN-LAST:event_agregarEventoBotonActionPerformed
    void visibilidadEventos (boolean x){
         eventLabel1.setVisible(x);
        eventLabel2.setVisible(x);
        eventLabel3.setVisible(x);
        eventLabel4.setVisible(x);
        eventLabel5.setVisible(x);
        eventLabel6.setVisible(x);
        eventLabel7.setVisible(x);
    }
    
    
    private void eventosDiaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventosDiaBotonActionPerformed
        String fecha = calendario.getDate().toString();
        String aux = conversionFecha(fecha);
        int n = 1;
        int i = 0;
         visibilidadEventos(false);
        
        while (sistema.getListadoEventos().size() > i) {

            if (sistema.getFechaDeEvento(i).equalsIgnoreCase(aux)) {
                //son iguales y hay que mostrarlo en un label
                System.out.println("Se encontro prro");
                switch (n) {
                    case 1:
                        eventLabel1.setVisible(true);
                        eventLabel1.setText(sistema.getEvento(i));
                        break;
                    case 2:
                        eventLabel2.setVisible(true);
                        eventLabel2.setText(sistema.getEvento(i));
                        break;
                    case 3:
                        eventLabel3.setVisible(true);
                        eventLabel3.setText(sistema.getEvento(i));
                        break;
                    case 4:
                        eventLabel4.setVisible(true);
                        eventLabel4.setText(sistema.getEvento(i));
                        break;
                    case 5:
                        eventLabel5.setVisible(true);
                        eventLabel5.setText(sistema.getEvento(i));
                        break;
                    case 6:
                        eventLabel6.setVisible(true);
                        eventLabel6.setText(sistema.getEvento(i));
                        break;
                    case 7:
                        eventLabel7.setVisible(true);
                        eventLabel7.setText(sistema.getEvento(i));
                        break;
                }
                n++;

            }

            i++;
        }


    }//GEN-LAST:event_eventosDiaBotonActionPerformed

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
    private javax.swing.JButton agregarEventoBoton;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JButton borrarEventoBoton;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JLabel dieciochoAlVeinticuatro;
    private javax.swing.JLabel eventLabel1;
    private javax.swing.JLabel eventLabel2;
    private javax.swing.JLabel eventLabel3;
    private javax.swing.JLabel eventLabel4;
    private javax.swing.JLabel eventLabel5;
    private javax.swing.JLabel eventLabel6;
    private javax.swing.JLabel eventLabel7;
    private javax.swing.JTextField eventoText;
    private javax.swing.JButton eventosDiaBoton;
    private javax.swing.JLabel hayEventosLosDiasLabel;
    private javax.swing.JLabel onceAlDiecisiete;
    private javax.swing.JButton paseosBoton;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel unoAlDiez;
    private javax.swing.JLabel veinticincoAlTreintayuno;
    // End of variables declaration//GEN-END:variables
}
