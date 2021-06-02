package SistemaCobro;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrarAlumno extends javax.swing.JFrame {

    public RegistrarAlumno() {
        initComponents();
        CerrarVentana();
        System.out.println("esta pantalla");
    }
    PreparedStatement st;
    Connection conn;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelnombre = new javax.swing.JLabel();
        labelapellido1 = new javax.swing.JLabel();
        labelapellido2 = new javax.swing.JLabel();
        labeltelefono = new javax.swing.JLabel();
        labelemail = new javax.swing.JLabel();
        labelcurp = new javax.swing.JLabel();
        labelrfc = new javax.swing.JLabel();
        labeltelefonoemergencia = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        foraneo = new javax.swing.JCheckBox();
        nombre = new javax.swing.JTextField();
        ap1 = new javax.swing.JTextField();
        ap2 = new javax.swing.JTextField();
        curp = new javax.swing.JTextField();
        rfc = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        teleme = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ne = new javax.swing.JTextField();
        labelnumexterno = new javax.swing.JLabel();
        ni = new javax.swing.JTextField();
        labelnuminterno = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        labelpostal = new javax.swing.JLabel();
        col = new javax.swing.JTextField();
        labelcolonia = new javax.swing.JLabel();
        muni = new javax.swing.JTextField();
        labelmunicipio = new javax.swing.JLabel();
        calle = new javax.swing.JTextField();
        labelcalle = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        labelestado = new javax.swing.JLabel();
        beca = new javax.swing.JTextField();
        labelbeca = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        labelfechain = new javax.swing.JLabel();
        Fecha_inscripcion = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelnombre.setText("*Nombre:");

        labelapellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelapellido1.setText("*Primer Apellido:");

        labelapellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelapellido2.setText("Segundo Apellido:");

        labeltelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeltelefono.setText("*Telefono:");

        labelemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelemail.setText("E-mail:");

        labelcurp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelcurp.setText("*CURP:");

        labelrfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelrfc.setText("RFC:");

        labeltelefonoemergencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labeltelefonoemergencia.setText("*Telefono de emergencia:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Direccion:");

        foraneo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        foraneo.setText("Alumno foraneo");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        labelnumexterno.setText("*Numero Externo:");

        labelnuminterno.setText("Numero Interno:");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*) campos obligatorios.");

        labelpostal.setText("*Codigo Postal:");

        labelcolonia.setText("*Colonia:");

        labelmunicipio.setText("*Municipio:");

        labelcalle.setText("*Calle:");

        labelestado.setText("*Estado:");

        beca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                becaActionPerformed(evt);
            }
        });

        labelbeca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelbeca.setText("Beca: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("%");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ej: 045550423");

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ej: 045550423");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("@");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("En caso de requerirse.");

        labelfechain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelfechain.setText("*Fecha de Inscripcion:");

        Fecha_inscripcion.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 588, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelnombre)
                                    .addComponent(labelapellido1)
                                    .addComponent(labelapellido2)
                                    .addComponent(labelcurp)
                                    .addComponent(labelrfc)
                                    .addComponent(labelfechain))
                                .addGap(114, 114, 114)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(ap1)
                                    .addComponent(ap2)
                                    .addComponent(curp)
                                    .addComponent(rfc)
                                    .addComponent(Fecha_inscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(443, 443, 443)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labeltelefono)
                                                    .addComponent(labeltelefonoemergencia)
                                                    .addComponent(foraneo))
                                                .addGap(68, 68, 68))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelemail)
                                                .addGap(185, 185, 185)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(tel, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(teleme)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelbeca)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(beca, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel2)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)
                                                .addGap(12, 12, 12)
                                                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelpostal)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelnuminterno)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelnumexterno)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(ne, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(labelcalle)
                                                            .addComponent(labelcolonia))
                                                        .addGap(28, 28, 28)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(col)
                                                            .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(labelestado))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(labelmunicipio)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(muni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelapellido1)
                    .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelapellido2)
                    .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelcurp)
                    .addComponent(curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelrfc)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelfechain)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelnumexterno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelnuminterno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelpostal)
                                    .addComponent(labelmunicipio)
                                    .addComponent(muni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelcalle)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelestado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(col, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelcolonia))
                                .addGap(26, 26, 26)))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labeltelefono)
                                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelemail)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labeltelefonoemergencia)
                                    .addComponent(teleme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(foraneo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(beca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelbeca)
                                .addComponent(jLabel2)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnCancelar)))
                    .addComponent(Fecha_inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null, "Se perdera la informacion del Alumno\n"
                + "¿Seguro que quiere salir de la ventana?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean correcto = validar();
        int ins = buscarInscrito();
        int cambiarDatos;
        if (ins != 0 && correcto) {
            cambiarDatos = JOptionPane.showConfirmDialog(null, "El alumno"+nombre.getText()+" "+ap1.getText()+" "+ap2.getText()+" ya se encuentra registrado,\n¿Desea cambiar sus datos?", "CUIDADO", JOptionPane.YES_NO_OPTION);
            if (cambiarDatos == JOptionPane.YES_OPTION) {
                EditarAlumno vent = new EditarAlumno();
                vent.imprimir(ins, curp.getText());
                vent.setVisible(true);
                this.dispose();
                return;
            } else {
                return;
            }
            
        }
        System.out.println("Aqui para");
        if (correcto == true && ins == 0) {
            try {
                conn = ConexionSQL.conectar();
                String sentencia = "INSERT INTO ALUMNO (NombrePila,PrimerApellido,SegundoApellido,Curp,Email,Telefono,TelefonoEmergencia,FechaInscripcion,"
                        + "RFC,Beca, Foraneo, NumeroExterno, NumeroInterno,Calle,Colonia,Municipio,Estado,CP,Status) values "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
                st = conn.prepareStatement(sentencia);
                st.setString(1, nombre.getText());
                st.setString(2, ap1.getText());
                st.setString(3, ap2.getText());
                st.setString(4, curp.getText());
                if (email.getText().equals("")) {
                    st.setString(5, "");
                } else {
                    st.setString(5, (email.getText() + "@" + email2.getText()));
                }
                st.setString(6, tel.getText());
                st.setString(7, teleme.getText());
                Date f = Fecha_inscripcion.getDate();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String x = df.format(f);
                st.setString(8, x);
                st.setString(9, rfc.getText());
                if (beca.getText().equals("")) {
                    st.setInt(10, 0);
                } else {
                    st.setInt(10, Integer.parseInt(beca.getText()));
                }

                if (foraneo.isSelected()) {
                    st.setString(11, "si");
                } else {
                    st.setString(11, "no");
                }
                st.setInt(12, Integer.parseInt(ne.getText()));
                if (ni.getText().equals("")) {
                    st.setInt(13, 0);
                } else {
                    st.setInt(13, Integer.parseInt(ni.getText()));
                }

                st.setString(14, calle.getText());
                st.setString(15, col.getText());
                st.setString(16, muni.getText());
                st.setString(17, estado.getText());
                st.setInt(18, Integer.parseInt(cp.getText()));
                st.setString(19, "Activo");
                int res = st.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "Exito!", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Ups! Algo salio mal", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                st.close();
                limpiar();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Ups! Algo salio mal", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void becaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_becaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_becaActionPerformed
    public boolean validar() {
        boolean correcto = true;
        if (nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Nombre' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelnombre.setForeground(Color.red);
            correcto = false;
        } else {
            labelnombre.setForeground(Color.black);
        }
        if (ap1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Primer Apellido' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelapellido1.setForeground(Color.red);
            correcto = false;
        } else {
            labelapellido1.setForeground(Color.black);
        }
        if (curp.getText().length() != 18) {
            JOptionPane.showMessageDialog(null, "La CURP tiene un error.\nDeben ser exactamente 18 caracteres.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelcurp.setForeground(Color.red);
            correcto = false;
        } else {
            labelcurp.setForeground(Color.black);
        }
        if (!rfc.getText().equals("") && rfc.getText().length() != 13) {
            JOptionPane.showMessageDialog(null, "El RFC tiene un error.\nDeben ser exactamente 13 caracteres.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelrfc.setForeground(Color.red);
            correcto = false;
        } else {
            labelrfc.setForeground(Color.black);
        }
        Date f = Fecha_inscripcion.getDate();
        if (f == null) {
            JOptionPane.showMessageDialog(null, "Se debe seleccionar una fecha para\nel campo 'Fecha de inscripcion.'", "Error!", JOptionPane.ERROR_MESSAGE);
            labelfechain.setForeground(Color.red);
            correcto = false;
        } else {
            labelfechain.setForeground(Color.black);
        }
        if (ne.getText().equals("") || !ne.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo 'Numero Exterior' se encuetra vacio o \ntiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelnumexterno.setForeground(Color.red);
            correcto = false;
        } else {
            labelnumexterno.setForeground(Color.black);
        }
        if (!ni.getText().equals("") && !ni.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo 'Numero Interno' se encuetra vacio o \ntiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelnuminterno.setForeground(Color.red);
            correcto = false;
        } else {
            labelnuminterno.setForeground(Color.black);
        }
        if (cp.getText().equals("") || !cp.getText().matches("[+-]?\\d*(\\.\\d+)?") || cp.getText().length() != 5) {
            JOptionPane.showMessageDialog(null, "El campo 'Codigo Postal' se encuetra vacio o \ntiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelpostal.setForeground(Color.red);
            correcto = false;
        } else {
            labelpostal.setForeground(Color.black);
            if (cp.getText().length() != 5) {
                JOptionPane.showMessageDialog(null, "El campo 'Codigo Postal' debe tener exactamente 5 digitos.", "Error!", JOptionPane.ERROR_MESSAGE);
                labelpostal.setForeground(Color.red);
                correcto = false;
            } else {
                labelpostal.setForeground(Color.black);
            }
        }
        if (calle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Calle' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelcalle.setForeground(Color.red);
            correcto = false;
        } else {
            labelcalle.setForeground(Color.black);
        }
        if (col.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Colonia' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelcolonia.setForeground(Color.red);
            correcto = false;
        } else {
            labelcolonia.setForeground(Color.black);
        }
        if (muni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Municipio' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelmunicipio.setForeground(Color.red);
            correcto = false;
        } else {
            labelmunicipio.setForeground(Color.black);
        }
        if (estado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Estado' no puede estar vacio.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelestado.setForeground(Color.red);
            correcto = false;
        } else {
            labelestado.setForeground(Color.black);
        }
        if (tel.getText().equals("") || !tel.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo 'Telefono' se encuetra vacio o \ntiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labeltelefono.setForeground(Color.red);
            correcto = false;
        } else {
            labeltelefono.setForeground(Color.black);
        }
        if (!email.getText().equals("") && email2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Email' esta incompleto.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelemail.setForeground(Color.red);
            correcto = false;
        } else {
            labelemail.setForeground(Color.black);
        }
        if (email.getText().equals("") && !email2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo 'Email' esta incompleto.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelemail.setForeground(Color.red);
            correcto = false;
        } else {
            labelemail.setForeground(Color.black);
        }
        if (teleme.getText().equals("") || !teleme.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo 'Telefono de emergencia' se encuetra vacio o \ntiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labeltelefonoemergencia.setForeground(Color.red);
            correcto = false;
        } else {
            labeltelefonoemergencia.setForeground(Color.black);
        }

        if (!beca.getText().equals("") && !beca.getText().matches("[+-]?\\d*(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "El campo 'Beca' tiene algun caracterer que no es un numero.", "Error!", JOptionPane.ERROR_MESSAGE);
            labelbeca.setForeground(Color.red);
            correcto = false;
        } else {
            labelbeca.setForeground(Color.black);
        }
        if (!muni.getText().equalsIgnoreCase("Morelia") && !muni.getText().equalsIgnoreCase("")) {
            foraneo.setSelected(true);
        }
        return correcto;
    }

    public void CerrarVentana() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    cerrar();

                }
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cerrar() {
        int desicion = JOptionPane.showConfirmDialog(null, "Se perdera toda la informacion del Alumno\n"
                + "¿Seguro que quiere salir de la ventana?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            this.dispose();
        }
    }

    public void limpiar() {
        nombre.setText("");
        ap1.setText("");
        ap2.setText("");
        curp.setText("");
        rfc.setText("");
        ne.setText("");
        ni.setText("");
        calle.setText("");
        col.setText("");
        cp.setText("");
        muni.setText("");
        estado.setText("");
        email.setText("");
        tel.setText("");
        teleme.setText("");
        //foraneo.sets
        foraneo.setSelected(false);
        beca.setText("");
        Fecha_inscripcion.setToolTipText("");
    }

    private int buscarInscrito() {
        int inscrito = 0;
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        String curpo = curp.getText();
        try {
            sql = conn.prepareStatement("SELECT NumeroControl, NombrePila, PrimerApellido, SegundoApellido FROM alumno WHERE CURP=" + "\'" + curp.getText() + "\'" + ";");
            rs = sql.executeQuery();
            if (rs.next()) {
                inscrito = rs.getInt("NumeroControl");
            } else {
                inscrito = 0;
            }
            return inscrito;
        } catch (SQLException e) {
            System.out.println(e);
        }

        return inscrito;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha_inscripcion;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JTextField beca;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField col;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField curp;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField estado;
    private javax.swing.JCheckBox foraneo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelapellido1;
    private javax.swing.JLabel labelapellido2;
    private javax.swing.JLabel labelbeca;
    private javax.swing.JLabel labelcalle;
    private javax.swing.JLabel labelcolonia;
    private javax.swing.JLabel labelcurp;
    private javax.swing.JLabel labelemail;
    private javax.swing.JLabel labelestado;
    private javax.swing.JLabel labelfechain;
    private javax.swing.JLabel labelmunicipio;
    private javax.swing.JLabel labelnombre;
    private javax.swing.JLabel labelnumexterno;
    private javax.swing.JLabel labelnuminterno;
    private javax.swing.JLabel labelpostal;
    private javax.swing.JLabel labelrfc;
    private javax.swing.JLabel labeltelefono;
    private javax.swing.JLabel labeltelefonoemergencia;
    private javax.swing.JTextField muni;
    private javax.swing.JTextField ne;
    private javax.swing.JTextField ni;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField teleme;
    // End of variables declaration//GEN-END:variables
}
