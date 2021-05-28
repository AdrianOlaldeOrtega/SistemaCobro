/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.awt.Color;
import java.awt.event.WindowStateListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Alumno extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;

    public Alumno() {
        initComponents();
        TableColumn columnaAlumno;
        columnaAlumno = TablaAlumno.getColumnModel().getColumn(1);
        columnaAlumno.setPreferredWidth(200);
        TableColumn columnaEstado;
        columnaEstado = TablaAlumno.getColumnModel().getColumn(2);
        columnaEstado.setPreferredWidth(40);
        TableColumn columnaNumeroControl;
        columnaNumeroControl = TablaAlumno.getColumnModel().getColumn(0);
        columnaNumeroControl.setPreferredWidth(60);
        TableColumn columnabtnMasinfo;
        columnabtnMasinfo = TablaAlumno.getColumnModel().getColumn(3);
        columnabtnMasinfo.setPreferredWidth(40);
        TableColumn columnabtnEditar;
        columnabtnEditar = TablaAlumno.getColumnModel().getColumn(4);
        columnabtnEditar.setPreferredWidth(30);
        TableColumn columnabtnEliminar;
        columnabtnEliminar = TablaAlumno.getColumnModel().getColumn(5);
        columnabtnEliminar.setPreferredWidth(30);
        contenidoTabla();
    }

    public void contenidoTabla() {
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        DefaultTableModel model = (DefaultTableModel) TablaAlumno.getModel();
        try {
            sql = conn.prepareStatement("SELECT NumeroControl,NombrePila,PrimerApellido,SegundoApellido,Status FROM alumno ORDER BY NumeroControl;");
            if (model.getRowCount() != 0) {
                int a = 0;
                while (a < model.getRowCount()) {
                    model.removeRow(a);
                }
            }
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{});
                TablaAlumno.setValueAt((rs.getInt("NumeroControl")), i, 0);
                String nombreCompleto = rs.getString("NombrePila") + " " + rs.getString("PrimerApellido") + " " + rs.getString("SegundoApellido");
                TablaAlumno.setValueAt(nombreCompleto, i, 1);
                if (rs.getString("Status").equals("Activo")) {
                    TablaAlumno.setValueAt("Activo", i, 2);
                } else {
                    TablaAlumno.setValueAt("Baja", i, 2);
                }
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumno = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelNumeroControl = new javax.swing.JLabel();
        NumeroControl = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num.de Control", "Nombre Completo", "Estado", "Mas informacion", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaAlumno);
        if (TablaAlumno.getColumnModel().getColumnCount() > 0) {
            TablaAlumno.getColumnModel().getColumn(0).setResizable(false);
            TablaAlumno.getColumnModel().getColumn(1).setResizable(false);
            TablaAlumno.getColumnModel().getColumn(2).setResizable(false);
            TablaAlumno.getColumnModel().getColumn(3).setResizable(false);
            TablaAlumno.getColumnModel().getColumn(4).setResizable(false);
            TablaAlumno.getColumnModel().getColumn(5).setResizable(false);
        }

        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Busqueda por Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alumnos");

        LabelNumeroControl.setText("Numero de Control: ");

        NumeroControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroControlActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar todos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelNumeroControl)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(NumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(196, 196, 196))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNumeroControl)
                    .addComponent(NumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnMostrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Consultas con = new Consultas();
        con.setTitle("Consultar pagos y alumnos");
        con.setLocationRelativeTo(null);
        con.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void NumeroControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroControlActionPerformed

    }//GEN-LAST:event_NumeroControlActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        String nc = NumeroControl.getText();
        DefaultTableModel model = (DefaultTableModel) TablaAlumno.getModel();
        try {
            sql = conn.prepareStatement("SELECT NumeroControl,NombrePila,PrimerApellido,SegundoApellido,Status FROM alumno WHERE NumeroControl=" + nc + ";");
            if (model.getRowCount() != 0) {
                int a = 0;
                while (a < model.getRowCount()) {
                    model.removeRow(a);
                }
            }
            rs = sql.executeQuery();
            if (rs.next()) {
                model.addRow(new Object[]{});
                TablaAlumno.setValueAt((rs.getInt("NumeroControl")), 0, 0);
                String nombreCompleto = rs.getString("NombrePila") + " " + rs.getString("PrimerApellido") + " " + rs.getString("SegundoApellido");
                TablaAlumno.setValueAt(nombreCompleto, 0, 1);
                if (rs.getString("Status").equals("Activo")) {
                    TablaAlumno.setValueAt("Activo", 0, 2);
                } else {
                    TablaAlumno.setValueAt("En baja", 0, 2);
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Numero de Control que se intenta buscar.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        contenidoTabla();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void eliminar() {
        int desicion = JOptionPane.showConfirmDialog(null, "La informacion del alumno se borrara de la base de datos.\n"
                + "¿Seguro que se desea eliminar al Alumno?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        //cambiar por Numero de control de la fila
        String nc = NumeroControl.getText();
        DefaultTableModel model = (DefaultTableModel) TablaAlumno.getModel();
        try {
            sql = conn.prepareStatement("DELETE FROM alumno WHERE NumeroControl = " + 3 + ";");
            if (model.getRowCount() != 0) {
                int a = 0;
                while (a < model.getRowCount()) {
                    model.removeRow(a);
                }
            }
            int s = sql.executeUpdate();
            if (s != 0 ) {
                JOptionPane.showMessageDialog(null, "El alumno fue eliminado de la base de datos.", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ups! Algo salio mal", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        }
    
    }
    private void editar() {
        EditarAlumno a = new EditarAlumno();
        a.imprimir(2);
        a.setVisible(true);
    }
    private void masinfo(){
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        //cambiar por numero de control de la columna
        String nc = NumeroControl.getText();
        try {
            sql = conn.prepareStatement("SELECT * FROM alumno WHERE NumeroControl=" + nc + ";");
            
            rs = sql.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Numero de control: "+rs.getInt("NumeroControl")+"\nNombre: "+rs.getString("NombrePila")
                +"\nPrimer Apellido: "+rs.getString("PrimerApellido")+"\nSegundo Apellido: "+rs.getString("SegundoApellido")+"\nCURP: "+rs.getString("CP")
                +"\nRFC: "+rs.getString("RFC")+"\nEmail: "+rs.getString("Email")+"\nTelefono: "+rs.getString("Telefono")+"\nTelefono de Emergencia: "+rs.getString("TelefonoEmergencia")
                +"\nFecha de Inscripcion: "+rs.getString("FechaInscripcion")+"\nBeca(%): "+rs.getString("Beca")+"\nEs foraneo: "+rs.getString("Foraneo")
                +"\n\nDOMICILIO"+"\n#"+rs.getString("NumeroExterno")+" Calle "+rs.getString("Calle")+" Col. "+rs.getString("Colonia"),"Informacion del Alumno",JOptionPane.INFORMATION_MESSAGE);                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Numero de Control que se intenta buscar.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        masinfo();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNumeroControl;
    private javax.swing.JTextField NumeroControl;
    private javax.swing.JTable TablaAlumno;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
