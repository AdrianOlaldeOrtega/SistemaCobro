/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author LEVEN
 */
public class RegistrarDeuda extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    Statement stt;
    ResultSet rs;
    Connection conn;

    /**
     * Creates new form NewJFrame
     */
    public RegistrarDeuda() {
        initComponents();
        Monto_error.setVisible(false);
        NoControl_error.setVisible(false);
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
        Nombre_Alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Monto_Pago = new javax.swing.JTextField();
        Concepto_Pago = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Monto_error = new javax.swing.JLabel();
        NoControl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(10, 31, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre_Alumno.setBackground(new java.awt.Color(10, 31, 34));
        Nombre_Alumno.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        Nombre_Alumno.setForeground(new java.awt.Color(63, 189, 211));
        Nombre_Alumno.setBorder(null);
        Nombre_Alumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nombre_AlumnoFocusLost(evt);
            }
        });
        Nombre_Alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Nombre_AlumnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nombre_AlumnoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_AlumnoKeyTyped(evt);
            }
        });
        jPanel1.add(Nombre_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 290, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N??MERO DE CONTROL ALUMNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(10, 31, 34));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 60));

        jButton1.setBackground(new java.awt.Color(10, 31, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 120, 60));

        Monto_Pago.setBackground(new java.awt.Color(10, 31, 34));
        Monto_Pago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
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
        jPanel1.add(Monto_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 290, 40));

        Concepto_Pago.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        Concepto_Pago.setForeground(new java.awt.Color(255, 255, 255));
        Concepto_Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Inscripcion", "Mensualidad", "Certificacion" }));
        Concepto_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Concepto_PagoActionPerformed(evt);
            }
        });
        jPanel1.add(Concepto_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 340, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONCEPTO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MONTO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DEUDAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_student_male_40px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 30, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_us_dollar_40px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, 40));

        jSeparator1.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 340, 17));

        jSeparator2.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 340, 17));

        Monto_error.setForeground(new java.awt.Color(255, 0, 0));
        Monto_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Monto_error.setText("jLabel7");
        jPanel1.add(Monto_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 340, -1));

        NoControl_error.setForeground(new java.awt.Color(255, 0, 0));
        NoControl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoControl_error.setText("jLabel7");
        jPanel1.add(NoControl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void Concepto_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Concepto_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Concepto_PagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String motivo = String.valueOf(Concepto_Pago.getSelectedItem());
        if (!Nombre_Alumno.getText().isEmpty() && !Monto_Pago.getText().isEmpty()) {
            try {
                conn = ConexionSQL.conectar();
                stt = conn.createStatement();
                //hacemos una consulta para ver si el alumno tiene deuda y si tiene deuda en este concepto
                String sentencia = "SELECT " + motivo + ", Saldo FROM deuda where ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
                rs = stt.executeQuery(sentencia);
                st = conn.prepareStatement(sentencia);
                //Verificamos si arroja un resultado
                if (rs.next()) {
                    double total = rs.getDouble(1) + Double.valueOf(Monto_Pago.getText()) - rs.getDouble(2);
                    //Revisamos si con el saldo a favor que tenia paga la deuda
                    //Si el resultado es negativo, solo actualizamos el valor de Slado al slado restante
                    System.out.println(total);
                    if (total < 0) {
                        total = total * (-1);
                        sentencia = "UPDATE DEUDA set " + motivo + " = 0 ,Saldo = " + total + " where ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
                        stt.executeUpdate(sentencia);
                    } //Si el total es positivo signifca que el saldo a favor no era suficiente, por que se debe poner en cero el saldo
                    //y poner la deuda restante en el concepto correponidente
                    //probado
                    else {
                        sentencia = "UPDATE DEUDA set " + motivo + " = " + total + " ,Saldo = 0 where ALUMNO_NumeroControl = " + Nombre_Alumno.getText();
                        stt.executeUpdate(sentencia);
                    }
                    //probado
                } else {
                    //Si este alumno no ha tenido una deuda se crea su registro
                    sentencia = "Insert into DEUDA (ALUMNO_NumeroControl,Libro,Inscripcion,Mensualidad,Certificacion,Saldo) values (?,?,?,?,?,?)";
                    st = conn.prepareStatement(sentencia);
                    switch (motivo) {
                        case "Libro":
                            st.setInt(1, Integer.parseInt(Nombre_Alumno.getText()));
                            st.setDouble(2, Double.valueOf(Monto_Pago.getText()));
                            st.setDouble(3, 0.0);
                            st.setDouble(4, 0.0);
                            st.setDouble(5, 0.0);
                            st.setDouble(6, 0.0);
                            break;
                        case "Insripci??n":
                            st.setInt(1, Integer.parseInt(Nombre_Alumno.getText()));
                            st.setDouble(2, 0.0);
                            st.setDouble(3, Double.valueOf(Monto_Pago.getText()));
                            st.setDouble(4, 0.0);
                            st.setDouble(5, 0.0);
                            st.setDouble(6, 0.0);
                            break;
                        case "Mensualidad":
                            st.setInt(1, Integer.parseInt(Nombre_Alumno.getText()));
                            st.setDouble(2, 0.0);
                            st.setDouble(3, 0.0);
                            st.setDouble(4, Double.valueOf(Monto_Pago.getText()));
                            st.setDouble(5, 0.0);
                            st.setDouble(6, 0.0);
                            break;
                        case "Certificacion":
                            st.setInt(1, Integer.parseInt(Nombre_Alumno.getText()));
                            st.setDouble(2, 0.0);
                            st.setDouble(3, 0.0);
                            st.setDouble(4, 0.0);
                            st.setDouble(5, Double.valueOf(Monto_Pago.getText()));
                            st.setDouble(6, 0.0);
                            break;
                    }
                    st.executeUpdate();
                }
                st.close();
                JOptionPane.showMessageDialog(null, "Se ha registrado con ??xito");
                limpiar();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Revise que todos los campos esten llenos");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void Nombre_AlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_AlumnoFocusLost

    }//GEN-LAST:event_Nombre_AlumnoFocusLost

    private void Nombre_AlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_AlumnoKeyPressed
        //validar_no_control();
    }//GEN-LAST:event_Nombre_AlumnoKeyPressed

    private void Nombre_AlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_AlumnoKeyTyped
        //validar_no_control();
    }//GEN-LAST:event_Nombre_AlumnoKeyTyped

    private void Nombre_AlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_AlumnoKeyReleased
        validar_no_control();
    }//GEN-LAST:event_Nombre_AlumnoKeyReleased

    private void Monto_PagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Monto_PagoKeyReleased
        validar_monto();
    }//GEN-LAST:event_Monto_PagoKeyReleased

    private void Monto_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Monto_PagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Monto_PagoActionPerformed
public void limpiar(){
        Nombre_Alumno.setText("");
        Monto_Pago.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Concepto_Pago;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void validar_no_control() {
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
                        //habilita_boton();
                        NoControl_error.setVisible(false);
                        jButton1.setEnabled(true);
                        //validar_monto();
                        
                    } else {
                        //habilita_boton();
                        jButton1.setEnabled(false);
                        NoControl_error.setText("id incorrecto");
                        NoControl_error.setVisible(true);
                    }
                    sql.close();
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarDeuda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        } catch (Exception e) {
            //habilita_boton();
            jButton1.setEnabled(false);
            NoControl_error.setText("id incorrecto");
            NoControl_error.setVisible(true);
            
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
                //habilita_boton();
                jButton1.setEnabled(true);
                Monto_error.setVisible(false);
                //validar_no_control();
                

            } else {
                if (montoPago.length() < 7 && !montoPago.contains(".")) {
                    //habilita_boton();
                    jButton1.setEnabled(true);
                    Monto_error.setVisible(false);
                    //validar_no_control();
                    
                } else {
                    //habilita_boton();
                    jButton1.setEnabled(false);
                    Monto_error.setText("Monto inv??lido");
                    Monto_error.setVisible(true);
                    
                }

            }

        } catch (Exception e) {
            //habilita_boton();
            jButton1.setEnabled(false);
            Monto_error.setText("Monto inv??lido");
            Monto_error.setVisible(true);
            
        }
    }
    
    public void habilita_boton(){
        if (Nombre_Alumno.getText().equalsIgnoreCase("") || Monto_Pago.getText().equalsIgnoreCase("")){
            jButton1.setEnabled(false);
        }else{
            jButton1.setEnabled(true);
        }
    }

}
