/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Yamir Garcia
 */
public class ConsultaPagos extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;

    JLabel label = new JLabel();
    ImageIcon iconoinfo = new ImageIcon("/Imagenes/info.png");

    /**
     * Creates new form ConsultaPagos
     */
    public ConsultaPagos() {
        initComponents();
        Panel_Busqueda.setVisible(false);
        TableColumn columnaid;
        columnaid = Tabla_Pagos.getColumnModel().getColumn(0);
        columnaid.setPreferredWidth(10);
        TableColumn columnaAlumno;
        columnaAlumno = Tabla_Pagos.getColumnModel().getColumn(1);
        columnaAlumno.setPreferredWidth(100);
        Date date = new Date();

        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String currentYear = getYearFormat.format(date);
        int anio = Integer.parseInt(currentYear);
        Selector_Anio.removeAllItems();
        for (int i = anio; i > (anio - 15); i--) {
            Selector_Anio.addItem(String.valueOf(i));
        }
        actualiza_tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipo_Busqueda = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Pagos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Panel_Busqueda = new javax.swing.JPanel();
        Selector_Mes = new javax.swing.JComboBox<>();
        Selector_Anio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tipo_Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Especifico" }));
        Tipo_Busqueda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Tipo_BusquedaItemStateChanged(evt);
            }
        });
        getContentPane().add(Tipo_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Tabla_Pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre Alumno", "Fecha", "Monto", "Concepto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_Pagos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 516, 233));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 357, 85, -1));

        Selector_Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin especificar", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", " " }));
        Selector_Mes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Selector_MesItemStateChanged(evt);
            }
        });

        Selector_Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Selector_Anio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Selector_AnioItemStateChanged(evt);
            }
        });

        jLabel1.setText("Mes");

        jLabel2.setText("Año");

        javax.swing.GroupLayout Panel_BusquedaLayout = new javax.swing.GroupLayout(Panel_Busqueda);
        Panel_Busqueda.setLayout(Panel_BusquedaLayout);
        Panel_BusquedaLayout.setHorizontalGroup(
            Panel_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BusquedaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Selector_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Selector_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Panel_BusquedaLayout.setVerticalGroup(
            Panel_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_BusquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selector_Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selector_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        getContentPane().add(Panel_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 11, -1, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tipo_BusquedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Tipo_BusquedaItemStateChanged

        String valor = String.valueOf(Tipo_Busqueda.getSelectedItem());
        if (valor.equalsIgnoreCase("Especifico")) {
            Panel_Busqueda.setVisible(true);
            Selector_Mes.setSelectedIndex(0);
            actualizar_tabla_especifica(String.valueOf(Selector_Mes.getSelectedItem()), String.valueOf(Selector_Anio.getSelectedItem()));

        } else {
            Panel_Busqueda.setVisible(false);
            actualiza_tabla();
        }

    }//GEN-LAST:event_Tipo_BusquedaItemStateChanged

    private void Selector_MesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Selector_MesItemStateChanged
        actualizar_tabla_especifica(String.valueOf(Selector_Mes.getSelectedItem()), String.valueOf(Selector_Anio.getSelectedItem()));
    }//GEN-LAST:event_Selector_MesItemStateChanged

    private void Selector_AnioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Selector_AnioItemStateChanged
        actualizar_tabla_especifica(String.valueOf(Selector_Mes.getSelectedItem()), String.valueOf(Selector_Anio.getSelectedItem()));
    }//GEN-LAST:event_Selector_AnioItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConsultaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Busqueda;
    private javax.swing.JComboBox<String> Selector_Anio;
    private javax.swing.JComboBox<String> Selector_Mes;
    private javax.swing.JTable Tabla_Pagos;
    private javax.swing.JComboBox<String> Tipo_Busqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
   
    public void actualiza_tabla(){
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
            String sentencia = "SELECT NumeroControl,NombrePila,FechaP,Monto,Concepto FROM alumno as a inner join pago as p on a.NumeroControl = p.ALUMNO_NumeroControl ";
            
            sentencia = sentencia + "ORDER BY NumeroControl";
            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getInt("NumeroControl"), rs.getString("NombrePila"), rs.getString("FechaP"), rs.getDouble("Monto"),rs.getString("Concepto")});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void actualizar_tabla_especifica(String mes, String anio) {
       
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
            String sentencia = "SELECT NumeroControl,NombrePila,FechaP,Monto,Concepto FROM alumno as a inner join pago as p on a.NumeroControl = p.ALUMNO_NumeroControl where year(FechaP) = " + anio;
            if (!mes.equalsIgnoreCase("Sin especificar")) {
                switch (mes) {
                    case "Enero":
                        mes = "01";
                        break;
                    case "Febrero":
                        mes = "02";
                        break;
                    case "Marzo":
                        mes = "03";
                        break;
                    case "Abril":
                        mes = "04";
                        break;
                    case "Mayo":
                        mes = "05";
                        break;
                    case "Junio":
                        mes = "06";
                        break;
                    case "Julio":
                        mes = "07";
                        break;
                    case "Agosto":
                        mes = "08";
                        break;
                    case "Septiembre":
                        mes = "09";
                        break;
                    case "Octubre":
                        mes = "10";
                        break;
                    case "Noviembre":
                        mes = "11";
                        break;
                    case "Diciembre":
                        mes = "12";
                        break;

                }
                sentencia = sentencia + " and Month(FechaP) = " + mes;
            }
            sentencia = sentencia + " ORDER BY NumeroControl";
            sql = conn.prepareStatement(sentencia);
            rs = sql.executeQuery();
            for (int i = 0; rs.next(); i++) {
                model.addRow(new Object[]{rs.getInt("NumeroControl"), rs.getString("NombrePila"), rs.getString("FechaP"), rs.getDouble("Monto"),rs.getString("Concepto")});
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
