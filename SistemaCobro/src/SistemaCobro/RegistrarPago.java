/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LEVEN
 */
public class RegistrarPago extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    Date fecha = new Date();

    /**
     * Creates new form NewJFrame
     */
    public RegistrarPago() {
        initComponents();
        Fecha_error.setVisible(false);
        NoControl_error.setVisible(false);
        Monto_error.setVisible(false);
        Fecha_Pago.setDate(fecha);
        habilita_boton();
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes2/logo.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fecha_Pago = new com.toedter.calendar.JDateChooser();
        Nombre_Alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Monto_Pago = new javax.swing.JTextField();
        Concepto_Pago = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fecha_error = new javax.swing.JLabel();
        NoControl_error = new javax.swing.JLabel();
        Monto_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 31, 34));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FECHA:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 76, -1, -1));

        Fecha_Pago.setBackground(new java.awt.Color(10, 31, 34));
        Fecha_Pago.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Fecha_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 109, 280, 40));

        Nombre_Alumno.setBackground(new java.awt.Color(10, 31, 34));
        Nombre_Alumno.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        Nombre_Alumno.setForeground(new java.awt.Color(63, 189, 211));
        Nombre_Alumno.setBorder(null);
        Nombre_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_AlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 300, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NÚMERO DE CONTROL ALUMNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 167, -1, -1));

        Monto_Pago.setBackground(new java.awt.Color(10, 31, 34));
        Monto_Pago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        Monto_Pago.setForeground(new java.awt.Color(63, 189, 211));
        Monto_Pago.setBorder(null);
        Monto_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Monto_PagoActionPerformed(evt);
            }
        });
        Monto_Pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Monto_PagoKeyReleased(evt);
            }
        });
        jPanel1.add(Monto_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 280, 40));

        Concepto_Pago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        Concepto_Pago.setForeground(new java.awt.Color(255, 255, 255));
        Concepto_Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Insripcion", "Mensualidad", "Certificacion", "Sin Especificar" }));
        Concepto_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Concepto_PagoActionPerformed(evt);
            }
        });
        jPanel1.add(Concepto_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 342, 37));

        btnCancelar.setBackground(new java.awt.Color(10, 31, 34));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 509, 135, 47));

        jButton1.setBackground(new java.awt.Color(10, 31, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 509, 135, 47));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONCEPTO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MONTO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PAGOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 342, 17));

        jSeparator2.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 342, 10));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_calendar_40px_1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 109, 52, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_student_male_40px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_us_dollar_40px.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 49, 35));

        Fecha_error.setForeground(new java.awt.Color(255, 0, 0));
        Fecha_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha_error.setText("jLabel9");
        jPanel1.add(Fecha_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 280, -1));

        NoControl_error.setForeground(new java.awt.Color(255, 0, 0));
        NoControl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoControl_error.setText("jLabel9");
        jPanel1.add(NoControl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 340, -1));

        Monto_error.setForeground(new java.awt.Color(255, 0, 0));
        Monto_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Monto_error.setText("jLabel9");
        jPanel1.add(Monto_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 340, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void Concepto_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Concepto_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Concepto_PagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Date f = Fecha_Pago.getDate();
        if (f != null) {
            if (validar_fecha()) {
                Fecha_error.setVisible(false);
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String x = df.format(f);
                if (!Nombre_Alumno.getText().isEmpty() && !Monto_Pago.getText().isEmpty()) {
                    try {
                        if (validar_no_control()) {
                            conn = ConexionSQL.conectar();
                            String sentencia = "Insert into PAGO (FechaP,Monto,ALUMNO_NumeroControl,Concepto) values (?,?,?,?)";
                            st = conn.prepareStatement(sentencia);
                            st.setString(1, x);
                            st.setDouble(2, Double.valueOf(Monto_Pago.getText()));
                            st.setInt(3, Integer.parseInt(Nombre_Alumno.getText()));
                            st.setString(4, Concepto_Pago.getSelectedItem().toString());

                            int res = st.executeUpdate();
                            if (res > 0) {
                                JOptionPane.showMessageDialog(null, "Se ha registrado con éxito");

                            } else {
                                JOptionPane.showMessageDialog(null, "Ups! Algo salio mal");
                            }
                            st.close();
                            ReducirDeuda();
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Revise que todos los campos esten llenos");
                }
            } else {
                Fecha_error.setText("Fecha inválida");
                Fecha_error.setVisible(true);
            }
        } else {
            Fecha_error.setText("Fecha inválida");
            Fecha_error.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void Nombre_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_AlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_AlumnoActionPerformed

    private void Monto_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Monto_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Monto_PagoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void Monto_PagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Monto_PagoKeyReleased
        validar_monto();
    }//GEN-LAST:event_Monto_PagoKeyReleased

    public void ReducirDeuda() {
        try {
            //hacemos la consulta para ver si dicho alumno tiene alguna deuda
            conn = ConexionSQL.conectar();
            String query = "SELECT Libro,Inscripcion,Mensualidad,Certificacion,Saldo FROM deuda WHERE ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
            stt = conn.createStatement();
            rs = stt.executeQuery(query);
            //Comprobamos si nos arrojo un resultado
            if (rs.next()) {
                //En caso de que no se especifique un motivo
                //probado
                if (Concepto_Pago.getSelectedItem().toString().equals("Sin Especificar")) {
                    Double monto = Double.valueOf(Monto_Pago.getText());
                    Double Libro, Inscripcion, Mensualidad, Certificacion, Saldo;
                    Libro = rs.getDouble(1);
                    Inscripcion = rs.getDouble(2);
                    Mensualidad = rs.getDouble(3);
                    Certificacion = rs.getDouble(4);
                    Saldo = rs.getDouble(5);
                    Double temp = 0.0;
                    if (monto > 0.0) {
                        temp = monto - Libro;
                        if (temp > 0.0) {
                            Libro = 0.0;
                            monto = temp;
                            temp = monto - Inscripcion;
                            if (temp > 0.0) {
                                Inscripcion = 0.0;
                                monto = temp;
                                temp = monto - Mensualidad;
                                if (temp > 0.0) {
                                    Mensualidad = 0.0;
                                    monto = temp;
                                    temp = monto - Certificacion;
                                    if (temp > 0.0) {
                                        Certificacion = 0.0;
                                        monto = temp;
                                        Saldo = Saldo + monto;
                                    } else {
                                        Certificacion = Certificacion - monto;
                                        monto = 0.0;
                                    }
                                } else {
                                    Mensualidad = Mensualidad - monto;
                                    monto = 0.0;
                                }
                            } else {
                                Inscripcion = Inscripcion - monto;
                                monto = 0.0;
                            }
                        } else {
                            Libro = Libro - monto;
                            monto = 0.0;
                        }
                        query = "Update DEUDA SET Libro = " + Libro
                                + ", Inscripcion = " + Inscripcion
                                + ", Mensualidad = " + Mensualidad
                                + ", Certificacion = " + Certificacion
                                + ", Saldo = " + Saldo + " WHERE ALUMNO_NumeroControl =" + Nombre_Alumno.getText();
                        stt.executeUpdate(query);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad mayor a 0");
                    }
                    //probado
                } else {
                    //Cuando se especifica un motivo
                    String concepto = String.valueOf(Concepto_Pago.getSelectedItem());
                    Double monto = Double.valueOf(Monto_Pago.getText());
                    Double deuda = 0.0;
                    String concepto_sent = "";
                    switch (concepto) {
                        //restamos la deuda que se tenga en este rubro y se le resta el monto pagado
                        case "Libro":
                            deuda = rs.getDouble(1);
                            deuda = deuda - monto;
                            concepto_sent = "Libro";
                            break;
                        case "Insripcion":
                            deuda = rs.getDouble(2);
                            deuda = deuda - monto;
                            concepto_sent = "Inscripcion";
                            break;
                        case "Mensualidad":
                            deuda = rs.getDouble(3);
                            deuda = deuda - monto;
                            concepto_sent = "Mensualidad";
                            break;
                        case "Certificacion":
                            deuda = rs.getDouble(4);
                            deuda = deuda - monto;
                            concepto_sent = "Certificacion";
                            break;
                    }
                    //probado
                    if (deuda < 0) {
                        query = "UPDATE DEUDA SET " + concepto_sent + " = 0, Saldo = " + (deuda * (-1)) + " WHERE ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
                        stt.executeUpdate(query);
                    } else {
                        query = "UPDATE DEUDA SET " + concepto_sent + " = " + deuda + " WHERE ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
                        stt.executeUpdate(query);
                    }
                }
                //probado
            } else {
                //Si el alumno no tiene aun una deuda, se le asigna al valor Saldo, que es el saldo a favor que tiene
                query = "Insert into deuda (ALUMNO_NumeroControl,Libro,Inscripcion,Mensualidad,Certificacion,Saldo) values (?,?,?,?,?,?)";
                st = conn.prepareStatement(query);
                st.setInt(1, Integer.parseInt(Nombre_Alumno.getText()));
                st.setDouble(2, 0.0);
                st.setDouble(3, 0.0);
                st.setDouble(4, 0.0);
                st.setDouble(5, 0.0);
                st.setDouble(6, Double.valueOf(Monto_Pago.getText()));
                st.executeUpdate();
            }
            st.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Concepto_Pago;
    private com.toedter.calendar.JDateChooser Fecha_Pago;
    private javax.swing.JLabel Fecha_error;
    private javax.swing.JTextField Monto_Pago;
    private javax.swing.JLabel Monto_error;
    private javax.swing.JLabel NoControl_error;
    private javax.swing.JTextField Nombre_Alumno;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
public void habilita_boton() {
        if (Nombre_Alumno.getText().equalsIgnoreCase("") || Monto_Pago.getText().equalsIgnoreCase("")) {
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }
    }

    public void validar_monto() {
        //extraemos el valor del campo
        String montoPago = Monto_Pago.getText();
        try {
            //tratamos de convertirlo a double para validar que no se ingresen caracteres indebidos
            //si falla la conversacion se atrapara el error
            double monto = Double.valueOf(montoPago);
            if (montoPago.length() < 10 && montoPago.contains(".")) {
                habilita_boton();
                jButton1.setEnabled(true);
                Monto_error.setVisible(false);

            } else {
                if (montoPago.length() < 7 && !montoPago.contains(".")) {
                    habilita_boton();
                    jButton1.setEnabled(true);
                    Monto_error.setVisible(false);

                } else {
                    habilita_boton();
                    jButton1.setEnabled(false);
                    Fecha_error.setText("Monto inválido");
                    Monto_error.setVisible(true);

                }

            }

        } catch (Exception e) {
            habilita_boton();
            jButton1.setEnabled(false);
            Monto_error.setText("Monto inválido");
            Monto_error.setVisible(true);

        }
    }

    public boolean validar_no_control() {
        boolean estado = false;
        String id = Nombre_Alumno.getText().trim();
        try {
            int idd = Integer.parseInt(id);
            if (!id.equalsIgnoreCase("")) {
                PreparedStatement sql = null;
                ResultSet rss = null;
                conn = ConexionSQL.conectar();

                String sentencia = "select NumeroControl from alumno where NumeroControl = " + id;
                try {
                    sql = conn.prepareStatement(sentencia);
                    rs = sql.executeQuery();
                    if (rs.next()) {
                        habilita_boton();
                        NoControl_error.setVisible(false);
                        sql.close();
                        estado = true;

                    } else {
                        habilita_boton();
                        NoControl_error.setText("id incorrecto");
                        NoControl_error.setVisible(true);
                        sql.close();
                        estado = false;

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarDeuda.class.getName()).log(Level.SEVERE, null, ex);
                    estado = false;
                }
            }
        } catch (Exception e) {
            habilita_boton();
            NoControl_error.setText("id incorrecto");
            NoControl_error.setVisible(true);
            estado = false;
            jButton1.setEnabled(false);
        }
        return estado;

    }

    public boolean validar_fecha() {
        boolean estado = false;
        Date f = Fecha_Pago.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String x = df.format(f);
        System.out.println(x);
        int tempanio = Integer.parseInt(x.substring(0, 4));
        int tempmes = Integer.parseInt(x.substring(5, 7));
        int tempdia = Integer.parseInt(x.substring(8, 10));
        System.out.println(tempmes + " : " + tempdia);
        Date date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        int anio = Integer.parseInt(currentYear);
        SimpleDateFormat getMonthFormat = new SimpleDateFormat("MM");
        String currentMonth = getMonthFormat.format(date);
        int mes = Integer.parseInt(currentMonth);
        SimpleDateFormat getDayFormat = new SimpleDateFormat("dd");
        String currentDay = getDayFormat.format(date);
        int dia = Integer.parseInt(currentDay);
        if (tempanio == anio) {
            if (tempmes == mes) {
                if (tempdia == dia) {
                    estado = true;
                } else {
                    if (tempdia > dia) {
                        estado = false;
                    } else {
                        estado = true;
                    }
                }
            } else {
                if (tempmes < mes) {
                    estado = true;
                } else {
                    estado = false;
                }

            }
        } else {
            if (tempanio < anio) {
                estado = true;
            } else {
                estado = false;
            }

        }
        return estado;
    }
}
