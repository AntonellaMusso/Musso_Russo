package interfaz;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mascota.Actividad;
import mascota.Alimento;
import mascota.Paseo;
import mascota.Servicio;
import mascota.Sistema;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import mascota.Familiar;

public class MuestraActividadesInterfaz extends javax.swing.JFrame {

    Date fecha;
    Sistema sistema;
    Actividad actividad[] = new Actividad[8];

    public MuestraActividadesInterfaz(Sistema modelo, Date date) {
        initComponents();
        setLocationRelativeTo(null); 
        int contador = 1;
        sistema = modelo;
        fecha = date;
        //todas las lineas a desactivar
        linea1.setVisible(false);
        linea2.setVisible(false);
        linea3.setVisible(false);
        linea4.setVisible(false);
        linea5.setVisible(false);
        linea6.setVisible(false);
        linea7.setVisible(false);
        m1.setVisible(false);
        m2.setVisible(false);
        m3.setVisible(false);
        m4.setVisible(false);
        m5.setVisible(false);
        m6.setVisible(false);
        m7.setVisible(false);
        servicio1.setVisible(false);


        jLabel1.setText("Estas son las actividades del dia: " + date.getDate() 
                + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));
        //vamos con actividades
        for (int i = 0; i < sistema.getListaActividades().size(); i++) {
            Actividad act;
            act = sistema.getListaActividades().get(i);
            if (sistema.fechasIguales(fecha, act.getFecha())) {
                //insertar actividad en la linea que corresponda (una vacia)
                switch (contador) {
                    case 1:
                        linea1.setText(act.toString());
                        contador++;
                        linea1.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m1.setVisible(true);
                            actividad[1] = act;
                        }
                        break;
                    case 2:
                        linea2.setText(act.toString());
                        contador++;
                        linea2.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m2.setVisible(true);
                            actividad[2] = act;
                        }
                        break;
                    case 3:
                        linea3.setText(act.toString());
                        contador++;
                        linea3.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m3.setVisible(true);
                            actividad[3] = act;
                        }
                        break;
                    case 4:
                        linea4.setText(act.toString());
                        contador++;
                        linea4.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m4.setVisible(true);
                            actividad[4] = act;
                        }
                        break;
                    case 5:
                        linea5.setText(act.toString());
                        contador++;
                        linea5.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m5.setVisible(true);
                            actividad[5] = act;
                        }
                        break;
                    case 6:
                        linea6.setText(act.toString());
                        contador++;
                        linea6.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m6.setVisible(true);
                            actividad[6] = act;
                        }
                        break;
                    case 7:
                        linea7.setText(act.toString());
                        contador++;
                        linea7.setVisible(true);
                        if (act.getCordenadasDePaseo() != null) {
                            m7.setVisible(true);
                            actividad[7] = act;
                        }
                        break;
                }

            }
        }
        //vamos con actividades periodicas
        for (int i = 0; i < sistema.getListaAlimentos().size(); i++) {
            Alimento a = sistema.getListaAlimentos().get(i);
            if (sistema.fechasIguales(a.getFecha(), fecha)) {
                alimento.setText(a.toString());
            }
        }
        for (int i = 0; i < sistema.getListadoPaseos().size(); i++) {
            Paseo p = sistema.getListadoPaseos().get(i);
            if (sistema.fechasIguales(p.getFecha(), fecha)) {
                paseo.setText(p.toString());
            }
        }
        //vamos con servicios
        for (int i = 0; i < sistema.getListaServicios().size(); i++) {
            Servicio s = sistema.getListaServicios().get(i);
            if (sistema.fechasIguales(s.getFecha(), fecha)){
                servicio1.setText(s.toString());
                servicio1.setVisible(true);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok = new javax.swing.JButton();
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
        serviciosTitulo = new javax.swing.JLabel();
        m7 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        servicio1 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ok.setBackground(new java.awt.Color(153, 255, 153));
        ok.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
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

        serviciosTitulo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        serviciosTitulo.setForeground(new java.awt.Color(0, 204, 204));
        serviciosTitulo.setText("Servicios");

        m7.setText("Mapa");
        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });

        m6.setText("Mapa");
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        m5.setText("Mapa");
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        m4.setText("Mapa");
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        m3.setText("Mapa");
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        m2.setText("Mapa");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        m1.setText("Mapa");
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        servicio1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        servicio1.setText("jLabel2");

        titulo3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 102, 51));
        titulo3.setText("Tareas fijadas");

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Enviar recordatorio");
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
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paseo)
                            .addComponent(alimento)
                            .addComponent(servicio1)))
                    .addComponent(serviciosTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(linea1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(284, 284, 284)
                                        .addComponent(ok)
                                        .addGap(67, 67, 67)
                                        .addComponent(jButton1)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titulo3)))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea1)
                    .addComponent(m1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea2)
                    .addComponent(m2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea3)
                    .addComponent(m3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea4)
                    .addComponent(m4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea5)
                    .addComponent(m5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea6)
                    .addComponent(m6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(linea7)
                    .addComponent(m7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(alimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paseo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(serviciosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicio1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        Calendario c = new Calendario(sistema);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_okActionPerformed
    //abren el mapa con su debido recorrido
    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[1].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[2].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[3].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[4].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[5].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[6].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        MapaMuestra mp;
        mp = new MapaMuestra(sistema, actividad[7].getCordenadasDePaseo());
        mp.setVisible(true);
    }//GEN-LAST:event_m7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mail = JOptionPane.showInputDialog(rootPane, "Ingrese mail para recordatorio");
        ArrayList<Alimento> ac =  sistema.getListaAlimentos();
        Iterator<Alimento> it =  ac.iterator();
        String Ac = "";
        while (it.hasNext()) {
            Alimento a = it.next();
            Ac = a.toString() + "/n";
        } 
        ArrayList<Paseo> pa =  sistema.getListadoPaseos();
        Iterator<Paseo> itP =  pa.iterator();
        String pas = "";
        while (it.hasNext()) {
            Paseo p = itP.next();
            pas = p.toString() + "/n";
        } 
        enviarConGMail(mail, "Recotdatorio de actividades", Ac);  
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    String remitente = "mascotais2018";  //Para la dirección nomcuenta@gmail.com
    String clave = "isMascota2018!";
    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);
    props.put("mail.smtp.clave", "isMascota2018!");    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO,  new InternetAddress(destinatario));   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
 
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JLabel linea4;
    private javax.swing.JLabel linea5;
    private javax.swing.JLabel linea6;
    private javax.swing.JLabel linea7;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton ok;
    private javax.swing.JLabel paseo;
    private javax.swing.JLabel servicio1;
    private javax.swing.JLabel serviciosTitulo;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
