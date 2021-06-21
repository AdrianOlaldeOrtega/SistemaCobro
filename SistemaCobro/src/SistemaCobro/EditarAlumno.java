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
import javax.swing.table.DefaultTableModel;

public class EditarAlumno extends javax.swing.JFrame {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;

    public EditarAlumno() {
        initComponents();
        CerrarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel6 = new javax.swing.JLabel();
        LabelNumeroControl = new javax.swing.JLabel();
        btnBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnMin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 980));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 31, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 980));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelnombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelnombre.setForeground(new java.awt.Color(255, 255, 255));
        labelnombre.setText("*Nombre:");
        jPanel1.add(labelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        labelapellido1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelapellido1.setForeground(new java.awt.Color(255, 255, 255));
        labelapellido1.setText("*Primer Apellido:");
        jPanel1.add(labelapellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        labelapellido2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelapellido2.setForeground(new java.awt.Color(255, 255, 255));
        labelapellido2.setText("Segundo Apellido:");
        jPanel1.add(labelapellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        labeltelefono.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labeltelefono.setForeground(new java.awt.Color(255, 255, 255));
        labeltelefono.setText("*Telefono:");
        jPanel1.add(labeltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, -1));

        labelemail.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelemail.setForeground(new java.awt.Color(255, 255, 255));
        labelemail.setText("E-mail:");
        jPanel1.add(labelemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, -1, -1));

        labelcurp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelcurp.setForeground(new java.awt.Color(255, 255, 255));
        labelcurp.setText("*CURP:");
        jPanel1.add(labelcurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        labelrfc.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelrfc.setForeground(new java.awt.Color(255, 255, 255));
        labelrfc.setText("RFC:");
        jPanel1.add(labelrfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        labeltelefonoemergencia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labeltelefonoemergencia.setForeground(new java.awt.Color(255, 255, 255));
        labeltelefonoemergencia.setText("*Telefono de emergencia:");
        jPanel1.add(labeltelefonoemergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        foraneo.setBackground(new java.awt.Color(10, 31, 34));
        foraneo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        foraneo.setForeground(new java.awt.Color(255, 255, 255));
        foraneo.setText("Alumno foraneo");
        jPanel1.add(foraneo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 847, -1, -1));

        nombre.setBackground(new java.awt.Color(10, 31, 34));
        nombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 320, 35));

        ap1.setBackground(new java.awt.Color(10, 31, 34));
        ap1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        ap1.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 320, 35));

        ap2.setBackground(new java.awt.Color(10, 31, 34));
        ap2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        ap2.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(ap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 320, 35));

        curp.setBackground(new java.awt.Color(10, 31, 34));
        curp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        curp.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 320, 35));

        rfc.setBackground(new java.awt.Color(10, 31, 34));
        rfc.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        rfc.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 320, 35));

        tel.setBackground(new java.awt.Color(10, 31, 34));
        tel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        tel.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 150, 35));

        email.setBackground(new java.awt.Color(10, 31, 34));
        email.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 150, 35));

        teleme.setBackground(new java.awt.Color(10, 31, 34));
        teleme.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        teleme.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(teleme, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 790, 150, 35));

        jButton1.setBackground(new java.awt.Color(10, 31, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 910, 160, 50));

        btnCancelar.setBackground(new java.awt.Color(10, 31, 34));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 910, 160, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 720, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 720, 10));

        ne.setBackground(new java.awt.Color(10, 31, 34));
        ne.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        ne.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(ne, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 100, 30));

        labelnumexterno.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelnumexterno.setForeground(new java.awt.Color(255, 255, 255));
        labelnumexterno.setText("*Numero Externo:");
        jPanel1.add(labelnumexterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        ni.setBackground(new java.awt.Color(10, 31, 34));
        ni.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        ni.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(ni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 100, 30));

        labelnuminterno.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelnuminterno.setForeground(new java.awt.Color(255, 255, 255));
        labelnuminterno.setText("Numero Interno:");
        jPanel1.add(labelnuminterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("(*) campos obligatorios.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        cp.setBackground(new java.awt.Color(10, 31, 34));
        cp.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        cp.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 100, 30));

        labelpostal.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelpostal.setForeground(new java.awt.Color(255, 255, 255));
        labelpostal.setText("*Codigo Postal:");
        jPanel1.add(labelpostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        col.setBackground(new java.awt.Color(10, 31, 34));
        col.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        col.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(col, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 100, 30));

        labelcolonia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelcolonia.setForeground(new java.awt.Color(255, 255, 255));
        labelcolonia.setText("*Colonia:");
        jPanel1.add(labelcolonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        muni.setBackground(new java.awt.Color(10, 31, 34));
        muni.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        muni.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(muni, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 100, 30));

        labelmunicipio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelmunicipio.setForeground(new java.awt.Color(255, 255, 255));
        labelmunicipio.setText("*Municipio:");
        jPanel1.add(labelmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

        calle.setBackground(new java.awt.Color(10, 31, 34));
        calle.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        calle.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 100, 30));

        labelcalle.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelcalle.setForeground(new java.awt.Color(255, 255, 255));
        labelcalle.setText("*Calle:");
        jPanel1.add(labelcalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        estado.setBackground(new java.awt.Color(10, 31, 34));
        estado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 13)); // NOI18N
        estado.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 100, 30));

        labelestado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        labelestado.setForeground(new java.awt.Color(255, 255, 255));
        labelestado.setText("*Estado:");
        jPanel1.add(labelestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        beca.setBackground(new java.awt.Color(10, 31, 34));
        beca.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        beca.setForeground(new java.awt.Color(63, 189, 211));
        beca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                becaActionPerformed(evt);
            }
        });
        jPanel1.add(beca, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 840, 150, 35));

        labelbeca.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelbeca.setForeground(new java.awt.Color(255, 255, 255));
        labelbeca.setText("Beca: ");
        jPanel1.add(labelbeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 850, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("%");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 850, -1, -1));

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Ej: 045550423");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, -1, -1));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ej: 045550423");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 800, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("@");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 740, -1, -1));

        email2.setBackground(new java.awt.Color(10, 31, 34));
        email2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        email2.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 740, 150, 35));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("En caso de requerirse.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        labelfechain.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        labelfechain.setForeground(new java.awt.Color(255, 255, 255));
        labelfechain.setText("*Fecha de Inscripcion:");
        jPanel1.add(labelfechain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        Fecha_inscripcion.setBackground(new java.awt.Color(10, 31, 34));
        Fecha_inscripcion.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(Fecha_inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 320, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de Control:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        LabelNumeroControl.setFont(new java.awt.Font("Segoe UI Semilight", 0, 19)); // NOI18N
        LabelNumeroControl.setForeground(new java.awt.Color(63, 189, 211));
        jPanel1.add(LabelNumeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 100, 319, 35));

        btnBaja.setBackground(new java.awt.Color(10, 31, 34));
        btnBaja.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        btnBaja.setForeground(new java.awt.Color(255, 255, 255));
        btnBaja.setText("DAR DE BAJA");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 160, 50));

        btnAlta.setBackground(new java.awt.Color(10, 31, 34));
        btnAlta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("DAR DE ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 160, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDITAR INFORMACIÓN ALUMNO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 580, 60));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        jPanel1.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, -1, -1));

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null, "Se cancelara cualquier cambio hecho en la informacion del Alumno\n"
                + "¿Seguro que quiere salir de la ventana?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            this.dispose();
        }

    }//GEN-LAST:event_btnCancelarActionPerformed
    public void imprimir(int NumeroControl, String curpo) {
        String st1 = "SELECT * FROM alumno WHERE NumeroControl=" + NumeroControl + ";";
        String st2 = "SELECT * FROM alumno WHERE CURP="+curpo+";";
        String sqlSt ="";
        if(curpo == "")
            sqlSt=st1;
        else
            sqlSt=st2;
        PreparedStatement sql = null;
        ResultSet rs = null;
        conn = ConexionSQL.conectar();
        try {
            sql = conn.prepareStatement(st1);
            rs = sql.executeQuery();
            if (rs.next()) {
                LabelNumeroControl.setText(String.valueOf(rs.getInt("NumeroControl")));
                nombre.setText(rs.getString("NombrePila"));
                ap1.setText(rs.getString("PrimerApellido"));
                ap2.setText(rs.getString("SegundoApellido"));
                curp.setText(rs.getString("CURP"));
                rfc.setText(rs.getString("RFC"));
                Fecha_inscripcion.setDate(rs.getDate("FechaInscripcion"));
                ne.setText(String.valueOf(rs.getInt("NumeroExterno")));
                ni.setText(String.valueOf(rs.getInt("NumeroInterno")));
                cp.setText(String.valueOf(rs.getInt("CP")));
                calle.setText(rs.getString("Calle"));
                col.setText(rs.getString("Colonia"));
                muni.setText(rs.getString("Municipio"));
                estado.setText(rs.getString("Estado"));
                tel.setText(rs.getString("Telefono"));
                String valores[] = new String[2];
                valores[0]="";
                valores[1]="";
                int r = 0;
                String email3 = rs.getString("Email");
                for (int n = 0; n < email3.length(); n++) {
                    char c = email3.charAt(n);
                    if (c == '@') {
                        r++;
                    } else {
                        valores[r] += c;
                    }
                }
                email.setText(email3.substring(0, email3.indexOf('@')));
                email2.setText(email3.substring(email3.indexOf('@')+1, email3.length()));
                teleme.setText(rs.getString("TelefonoEmergencia"));
                String f = rs.getString("Foraneo");
                if (f.equals("si")) {
                    foraneo.setSelected(true);
                } else {
                    foraneo.setSelected(false);
                }
                beca.setText(String.valueOf(rs.getInt("Beca")));
                String estado = rs.getString("Status");
                if (estado.equals("Activo")) {
                    btnAlta.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(null, "El alumno actualmente se encuentra dado de baja.\n"
                            + "Si es que se dara de Alta de nuevo es necesario tomar\n"
                            + "en cuenta la Fecha de Inscipcion.\n"
                            + "Si se desea continuar con la asignada al principio\n"
                            + "no es necesario hacer nada, solo presionar 'Dar de Alta'.\n\n"
                            + "Si se quiere tomar en cuenta una nueva fecha es necesario\n"
                            + "modificar el campo 'Fecha de Inscripcion' y dar 'Guardar'.\n"
                            + "Esto se puede hacer antes o despues de darlo de alta.", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
                    btnBaja.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Numero de Control que se intenta buscar.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean correcto = validar();
        PreparedStatement st;
        Connection conn;
        if (correcto == true) {
            try {
                conn = ConexionSQL.conectar();
                String sentencia = "UPDATE alumno SET NombrePila = ?,PrimerApellido = ?,SegundoApellido = ?,Curp = ?,Email = ?"
                        + ",Telefono = ?,TelefonoEmergencia = ?,FechaInscripcion = ?,RFC = ?,Beca = ?, Foraneo= ?, "
                        + "NumeroExterno= ? , NumeroInterno = ?,Calle = ?,Colonia = ?,Municipio = ?,Estado = ?,CP = ?,Status=? "
                        + "WHERE NumeroControl = " + LabelNumeroControl.getText();
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
                    this.dispose();
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

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null, "¿Seguro que se quiere de dar de baja al Alumno?", "Baja", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            PreparedStatement st;
            Connection conn;
            try {
                conn = ConexionSQL.conectar();
                String sentencia = "UPDATE alumno SET Status = 'Ausente' WHERE NumeroControl = ?";
                st = conn.prepareStatement(sentencia);
                st.setString(1, LabelNumeroControl.getText());
                int res = st.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha dado de baja con éxito", "Exito!", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Ups! Algo salio mal", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                st.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
            btnAlta.setEnabled(true);
            btnBaja.setEnabled(false);
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null, "¿Seguro que se quiere de dar de alta al Alumno?", "Alta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            PreparedStatement st;
            Connection conn;
            try {
                conn = ConexionSQL.conectar();
                String sentencia = "UPDATE alumno SET Status = 'Activo' WHERE NumeroControl = ?";
                st = conn.prepareStatement(sentencia);
                st.setString(1, LabelNumeroControl.getText());
                int res = st.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha dado de alta con éxito", "Exito!", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Ups! Algo salio mal", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                st.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
            btnAlta.setEnabled(false);
            btnBaja.setEnabled(true);
        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null, "Se perdera la informacion del Alumno\n"
            + "¿Seguro que quiere salir de la ventana?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (desicion == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed
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
        try{
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                cerrar();

            }
        });
        }catch(Exception e){
            System.out.println(e);
        }
    }  
    public void cerrar(){
        int desicion = JOptionPane.showConfirmDialog(null, "Se cancelara cualquier cambio hecho en la informacion del Alumno\n"
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
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha_inscripcion;
    private javax.swing.JLabel LabelNumeroControl;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JTextField beca;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
