package interfaz;

import java.util.Date;
import mascota.Actividad;
import mascota.Alimento;
import mascota.Paseo;
import mascota.Sistema;

public class MuestraActividadesInterfaz extends javax.swing.JFrame {

    Date fecha;
    Sistema sistema;

    public MuestraActividadesInterfaz(Sistema modelo, Date date) {
        initComponents();
        int contador = 1;
        sistema = modelo;
        fecha = date;
        linea1.setVisible(false);
        linea2.setVisible(false);
        linea3.setVisible(false);
        linea4.setVisible(false);
        linea5.setVisible(false);
        linea6.setVisible(false);
        linea7.setVisible(false);

        jLabel1.setText("Estas son las actividades del dia: " + date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear()+1900));
        //vamos con actividades
        for (int i = 0; i < sistema.getListaActividades().size(); i++) {
            Actividad act;
            act = sistema.getListaActividades().get(i);
            if (sistema.fechasIguales(fecha, act.getFecha())) {
                //insertar actividad en label
                switch (contador) {
                    case 1:
                        linea1.setText(act.toString());
                        contador++;
                        linea1.setVisible(true);
                        break;
                    case 2:
                        linea2.setText(act.toString());
                        contador++;
                        linea2.setVisible(true);
                        break;
                    case 3:
                        linea3.setText(act.toString());
                        contador++;
                        linea3.setVisible(true);
                        break;
                    case 4:
                        linea4.setText(act.toString());
                        contador++;
                        linea4.setVisible(true);
                        break;
                    case 5:
                        linea5.setText(act.toString());
                        contador++;
                        linea5.setVisible(true);
                        break;
                    case 6:
                        linea6.setText(act.toString());
                        contador++;
                        linea6.setVisible(true);
                        break;
                    case 7:
                        linea7.setText(act.toString());
                        contador++;
                        linea7.setVisible(true);
                        break;
                }

            }
        }
        //vamos con el resto
        for (int i = 0; i < sistema.getListaAlimentos().size(); i++) {
            Alimento a = sistema.getListaAlimentos().get(i);
            if (sistema.fechasIguales(a.getFecha(), fecha)){
                alimento.setText(a.toString());
            }
        }
        for (int i = 0; i < sistema.getListadoPaseos().size(); i++) {
            Paseo p = sistema.getListadoPaseos().get(i);
            if (sistema.fechasIguales(p.getFecha(), fecha)){
                paseo.setText(p.toString());
            }
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();
        linea3 = new javax.swing.JLabel();
        linea4 = new javax.swing.JLabel();
        linea5 = new javax.swing.JLabel();
        linea6 = new javax.swing.JLabel();
        linea7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        alimento = new javax.swing.JLabel();
        paseo = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Estos son las act del dia");

        linea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea1.setText("jLabel2");

        linea2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea2.setText("jLabel2");

        linea3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea3.setText("jLabel2");

        linea4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea4.setText("jLabel2");

        linea5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea5.setText("jLabel2");

        linea6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea6.setText("jLabel2");

        linea7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        linea7.setText("jLabel2");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        alimento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        alimento.setText("Alimentacion: Ninguna");

        paseo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        paseo.setText("Paseo: Ninguno");

        titulo2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 102, 51));
        titulo2.setText("Actividades fijadas para hoy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linea3)
                            .addComponent(linea4)
                            .addComponent(linea5)
                            .addComponent(linea6)
                            .addComponent(linea7)
                            .addComponent(linea2)
                            .addComponent(linea1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paseo)
                            .addComponent(alimento))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(linea1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linea7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo2)
                .addGap(30, 30, 30)
                .addComponent(alimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paseo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JLabel linea4;
    private javax.swing.JLabel linea5;
    private javax.swing.JLabel linea6;
    private javax.swing.JLabel linea7;
    private javax.swing.JLabel paseo;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
