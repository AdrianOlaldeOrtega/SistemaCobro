package SistemaCobro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Consulta_Deudores extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    List<Datos> datos = new ArrayList<>();

    ; 

    public Consulta_Deudores() {
        initComponents();
        actualiza_tabla();
        Ruta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Deuda = new javax.swing.JTable();
        btn_Salir = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        id_alumno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_Mostrar = new javax.swing.JButton();
        Ruta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(10, 31, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Deuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Libro", "Inscripción", "Mensualidad", "Certifiación", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Deuda);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 580, -1));

        btn_Salir.setBackground(new java.awt.Color(10, 31, 34));
        btn_Salir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Salir.setText("CANCELAR");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 120, 35));

        btn_Guardar.setBackground(new java.awt.Color(10, 31, 34));
        btn_Guardar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar.setText("GUARDAR");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 200, 35));

        id_alumno.setBackground(new java.awt.Color(10, 31, 34));
        id_alumno.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        id_alumno.setForeground(new java.awt.Color(63, 189, 211));
        id_alumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_alumno.setBorder(null);
        jPanel1.add(id_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btn_Buscar.setBackground(new java.awt.Color(10, 31, 34));
        btn_Buscar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Buscar.setText("BUSCAR");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 100, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEUDAS POR ALUMNO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btn_Mostrar.setBackground(new java.awt.Color(10, 31, 34));
        btn_Mostrar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn_Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Mostrar.setText("MOSTRAR TODOS");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 200, 35));

        Ruta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        Ruta.setForeground(new java.awt.Color(255, 255, 255));
        Ruta.setText("Ruta");
        jPanel1.add(Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 200, 17));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.dispose();

    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
        actualiza_tabla();
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        busqueda();
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        for (int i = 0; i < Tabla_Deuda.getRowCount(); i++) {
            Datos info = new Datos();
            info.setId(String.valueOf(Tabla_Deuda.getValueAt(i, 0)));
            info.setNombre(String.valueOf(Tabla_Deuda.getValueAt(i, 1)));
            info.setLibro(String.valueOf(Tabla_Deuda.getValueAt(i, 2)));
            info.setInscripcion(String.valueOf(Tabla_Deuda.getValueAt(i, 3)));
            info.setMensualidad(String.valueOf(Tabla_Deuda.getValueAt(i, 4)));
            info.setCertificado(String.valueOf(Tabla_Deuda.getValueAt(i, 5)));
            info.setSaldo(String.valueOf(Tabla_Deuda.getValueAt(i, 6)));
            datos.add(info);
        }
        FileChooser obj = new FileChooser();
        //obj.setVisible(true);

        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        
    }//GEN-LAST:event_formFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (!Ruta.getText().equalsIgnoreCase("Ruta")) {
            Guardar_pdf pdf = new Guardar_pdf(this.datos, (Ruta.getText() + ".pdf"));
            pdf.crearPlantilla();
            Ruta.setText("Ruta");
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Ruta;
    private javax.swing.JTable Tabla_Deuda;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JTextField id_alumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public void actualiza_tabla() {
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
            String sentencia = "SELECT ALUMNO_NumeroControl, NombrePila, Libro, Inscripcion, Mensualidad, Certificacion, Saldo FROM alumno as a inner join deuda as p on a.NumeroControl = p.ALUMNO_NumeroControl ";

            sentencia = sentencia + "ORDER BY NumeroControl";
            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getInt("ALUMNO_NumeroControl"), rs.getString("NombrePila"), rs.getDouble("Libro"), rs.getDouble("Inscripcion"), rs.getDouble("Mensualidad"), rs.getDouble("Certificacion"), rs.getDouble("Saldo")});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void busqueda() {
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
            String sentencia = "SELECT ALUMNO_NumeroControl, NombrePila, Libro, Inscripcion, Mensualidad, Certificacion, Saldo FROM alumno as a inner join deuda as p on a.NumeroControl = p.ALUMNO_NumeroControl where ALUMNO_NumeroControl = " + id_alumno.getText();

            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getInt("ALUMNO_NumeroControl"), rs.getString("NombrePila"), rs.getDouble("Libro"), rs.getDouble("Inscripcion"), rs.getDouble("Mensualidad"), rs.getDouble("Certificacion"), rs.getDouble("Saldo")});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
