package SistemaCobro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Variables_del_sistema extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    double monto = 0;
    int idusuario;

    Variables_del_sistema(int idusuario) {
        initComponents();
        this.idusuario = idusuario;
        dato();
        btn_actualizar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mens = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mensualidad");

        mens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mensKeyReleased(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(mens, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_actualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mensKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensKeyReleased
        if (validar()) {
            btn_actualizar.setEnabled(true);
        } else {
            btn_actualizar.setEnabled(false);
        }
    }//GEN-LAST:event_mensKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        try {
            conn = ConexionSQL.conectar();
            String query = "update variable set mensualidad = " + mens.getText() + " where mensualidad = " + monto;
            stt = conn.createStatement();
            stt.executeUpdate(query);
            conn.close();
            dato();
            String desc = "Modificó valores del sistema ";
            RegistrarMovimiento r = new RegistrarMovimiento(idusuario, desc);
            btn_actualizar.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField mens;
    // End of variables declaration//GEN-END:variables

    public void dato() {
        try {
            conn = ConexionSQL.conectar();
            String query = "SELECT * from variable";
            stt = conn.createStatement();
            rs = stt.executeQuery(query);
            rs.next();
            monto = Double.valueOf(rs.getString(1));
            mens.setText(rs.getString(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean validar() {
        boolean estado = false;
        String montoPago = mens.getText();
        try {
            //tratamos de convertirlo a double para validar que no se ingresen caracteres indebidos
            //si falla la conversacion se atrapara el error
            double monto = Double.valueOf(montoPago);
            System.out.println(monto);
            if (montoPago.length() < 10 && montoPago.contains(".")) {
                estado = true;

            } else {
                if (montoPago.length() < 7 && !montoPago.contains(".")) {
                    estado = true;
                } else {
                    estado = false;

                }

            }

        } catch (Exception e) {
            estado = false;

        }
        return estado;
    }
}
