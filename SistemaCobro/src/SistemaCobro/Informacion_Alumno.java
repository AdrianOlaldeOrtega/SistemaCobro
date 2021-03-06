/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yamir Garcia
 */
public class Informacion_Alumno extends javax.swing.JFrame {
    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    String nc;

    /**
     * Creates new form Informacion_Alumno
     */
    

    public Informacion_Alumno() {
        
        
        
    }

    Informacion_Alumno(String Nocontrol) {
        initComponents();
        nc = Nocontrol;
        masinfo(nc);
        actualiza_tabla_deuda ();
        actualiza_tabla_pagos();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Deuda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Pagos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Info_Alumno = new javax.swing.JTextArea();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 31, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Deuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Libro", "Inscripci??n", "Mensualidad", "Certificaci??n", "Saldo a favor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Deuda);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 578, 80));

        Tabla_Pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Fecha", "Monto", "Concepto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Pagos.setOpaque(false);
        jScrollPane2.setViewportView(Tabla_Pagos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 578, 286));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deuda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Historial de pagos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        Info_Alumno.setEditable(false);
        Info_Alumno.setBackground(new java.awt.Color(217, 217, 217));
        Info_Alumno.setColumns(20);
        Info_Alumno.setRows(5);
        Info_Alumno.setOpaque(false);
        Info_Alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Info_AlumnoMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(Info_Alumno);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 251, 419));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INFORMACI??N DEL ALUMNO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 540, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Info_AlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_AlumnoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Info_AlumnoMouseEntered

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    private void masinfo(String nc) {
        System.out.println(nc);
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        String info = "";
        //cambiar por numero de control de la columna
        try {
            sql = conn.prepareStatement("SELECT * FROM alumno WHERE NumeroControl=" + nc + ";");

            rs = sql.executeQuery();
            if (rs.next()) {
                info = "Numero de control: " + rs.getInt("NumeroControl") + "\nNombre: " + rs.getString("NombrePila")
                        + "\nPrimer Apellido: " + rs.getString("PrimerApellido") + "\nSegundo Apellido: " + rs.getString("SegundoApellido") + "\nCURP: " + rs.getString("CURP")
                        + "\nRFC: " + rs.getString("RFC") + "\nEmail: " + rs.getString("Email") + "\nTelefono: " + rs.getString("Telefono") + "\nTelefono de Emergencia: " + rs.getString("TelefonoEmergencia")
                        + "\nFecha de Inscripcion: " + rs.getString("FechaInscripcion") + "\nBeca(%): " + rs.getString("Beca") + "\nEs foraneo: " + rs.getString("Foraneo")
                        + "\n\nDOMICILIO" + "\n#" + rs.getString("NumeroExterno") + " Calle " + rs.getString("Calle") + " Col. " + rs.getString("Colonia");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Numero de Control que se intenta buscar.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
           
        } catch (SQLException e) {
            System.out.println(e);
        }
        Info_Alumno.setText(info);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Info_Alumno;
    private javax.swing.JTable Tabla_Deuda;
    private javax.swing.JTable Tabla_Pagos;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
public void actualiza_tabla_pagos(){
         Tabla_Pagos.setDefaultRenderer(Object.class, new ImgTable());
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        DefaultTableModel model = (DefaultTableModel) Tabla_Pagos.getModel();
        if (model.getRowCount() != 0) {
            int a = 0;
            while (a < model.getRowCount()) {
                model.removeRow(a);
            }
        }
        try {
            String sentencia = "SELECT NumeroControl,NombrePila,FechaP,Monto,Concepto FROM alumno as a inner join pago as p on a.NumeroControl = p.ALUMNO_NumeroControl where NumeroControl = "+nc;
            
            sentencia = sentencia + " ORDER BY FechaP DESC";
            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getInt("NumeroControl"), rs.getString("NombrePila"), rs.getString("FechaP"), rs.getDouble("Monto"),rs.getString("Concepto")});
            }
            sql.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

public void actualiza_tabla_deuda (){
    Tabla_Deuda.setDefaultRenderer(Object.class, new ImgTable());
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        DefaultTableModel model = (DefaultTableModel) Tabla_Deuda.getModel();
        if (model.getRowCount() != 0) {
            int a = 0;
            while (a < model.getRowCount()) {
                model.removeRow(a);
            }
        }
        try {
            String sentencia = "SELECT * from deuda where ALUMNO_NumeroControl = "+nc;
            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getDouble("Libro"), rs.getString("Inscripcion"), rs.getDouble("Mensualidad"),rs.getDouble("Certificacion"),rs.getDouble("Saldo")});
            }
            sql.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
}


}

