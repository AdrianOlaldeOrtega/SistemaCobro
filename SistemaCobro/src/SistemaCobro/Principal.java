package SistemaCobro;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.script.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Principal extends javax.swing.JFrame {

    String Acceso = "";
    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    DecimalFormat df = new DecimalFormat("#.00000000");
    static int contador = 0;
    String Usuario = "";
    int idusuario;

    public Principal() {
        initComponents();
        btnmenu.setVisible(false);
        this.setLocationRelativeTo(null);
        Panel_fondo_menu.setVisible(false);
        Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
        Panel_Menu_Consultas.setVisible(false);
        Panel_Menu_Admin.setVisible(false);
        error_usuario.setVisible(false);
        error_psw.setVisible(false);
        btn_cerrarsesion.setVisible(false);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes2/logo.jpg"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cerrarsesion = new javax.swing.JButton();
        panel_Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        error_psw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        error_usuario = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        psw = new javax.swing.JPasswordField();
        Panel_principal = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        Panel_Menu_Finanzas = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Panel_Menu_Consultas = new javax.swing.JPanel();
        Consutla_Pago = new javax.swing.JButton();
        Consulta_Alumno = new javax.swing.JButton();
        Consulta_Deudores = new javax.swing.JButton();
        Panel_Menu_Admin = new javax.swing.JPanel();
        btn_cons_mov = new javax.swing.JButton();
        btn_alta_usuarios = new javax.swing.JButton();
        btn_valores = new javax.swing.JButton();
        Panel_menu = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        Panel_fondo_menu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrarsesion.setText("Cerrar sesión");
        btn_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 10, 130, 40));

        panel_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        panel_Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 170));

        jLabel2.setText("Usuario:");
        panel_Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        panel_Login.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, -1));

        error_psw.setForeground(new java.awt.Color(255, 0, 0));
        error_psw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_psw.setText("Contraseña Incorrecta");
        panel_Login.add(error_psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 220, -1));

        jLabel4.setText("Contraseña");
        panel_Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        error_usuario.setForeground(new java.awt.Color(255, 0, 0));
        error_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_usuario.setText("Usuario Incorrecto");
        panel_Login.add(error_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, -1));

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        panel_Login.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 220, -1));

        psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswActionPerformed(evt);
            }
        });
        panel_Login.add(psw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, -1));

        getContentPane().add(panel_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 240, 360));

        Panel_principal.setBackground(new java.awt.Color(10, 31, 34));
        Panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(10, 31, 34));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_cancel_40px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        Panel_principal.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        btnMin.setBackground(new java.awt.Color(10, 31, 34));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/icons8_minus_40px.png"))); // NOI18N
        btnMin.setBorder(null);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        Panel_principal.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_menu_sin_presionar.png"))); // NOI18N
        btnmenu.setBorderPainted(false);
        btnmenu.setContentAreaFilled(false);
        btnmenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_menu_apretado.png"))); // NOI18N
        btnmenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_menu_sin_presionar.png"))); // NOI18N
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
            }
        });
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        Panel_principal.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        Panel_Menu_Finanzas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Menu_Finanzas.setOpaque(false);
        Panel_Menu_Finanzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Menu_FinanzasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Menu_FinanzasMouseExited(evt);
            }
        });
        Panel_Menu_Finanzas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(10, 31, 34));
        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar Deuda");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_Menu_Finanzas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 40));

        jButton1.setBackground(new java.awt.Color(10, 31, 34));
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar Pago");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_Menu_Finanzas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 40));

        Panel_principal.add(Panel_Menu_Finanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        Panel_Menu_Consultas.setOpaque(false);
        Panel_Menu_Consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Menu_ConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Menu_ConsultasMouseExited(evt);
            }
        });
        Panel_Menu_Consultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Consutla_Pago.setText("Pago");
        Consutla_Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Consutla_PagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Consutla_PagoMouseExited(evt);
            }
        });
        Consutla_Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consutla_PagoActionPerformed(evt);
            }
        });
        Panel_Menu_Consultas.add(Consutla_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 40));

        Consulta_Alumno.setText("Alumno");
        Consulta_Alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Consulta_AlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Consulta_AlumnoMouseExited(evt);
            }
        });
        Consulta_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_AlumnoActionPerformed(evt);
            }
        });
        Panel_Menu_Consultas.add(Consulta_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 40));

        Consulta_Deudores.setText("Deudores");
        Consulta_Deudores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Consulta_DeudoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Consulta_DeudoresMouseExited(evt);
            }
        });
        Consulta_Deudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consulta_DeudoresActionPerformed(evt);
            }
        });
        Panel_Menu_Consultas.add(Consulta_Deudores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 40));

        Panel_principal.add(Panel_Menu_Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        Panel_Menu_Admin.setOpaque(false);
        Panel_Menu_Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Menu_AdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Menu_AdminMouseExited(evt);
            }
        });
        Panel_Menu_Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cons_mov.setText("Consulta Movimientos");
        btn_cons_mov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cons_movMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cons_movMouseExited(evt);
            }
        });
        btn_cons_mov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cons_movActionPerformed(evt);
            }
        });
        Panel_Menu_Admin.add(btn_cons_mov, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 40));

        btn_alta_usuarios.setText("Usuarios");
        btn_alta_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_alta_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_alta_usuariosMouseExited(evt);
            }
        });
        btn_alta_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alta_usuariosActionPerformed(evt);
            }
        });
        Panel_Menu_Admin.add(btn_alta_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 40));

        btn_valores.setText("Valores del Sistema");
        btn_valores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_valoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_valoresMouseExited(evt);
            }
        });
        btn_valores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valoresActionPerformed(evt);
            }
        });
        Panel_Menu_Admin.add(btn_valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 40));

        Panel_principal.add(Panel_Menu_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 250, 160));

        Panel_menu.setBackground(new java.awt.Color(167, 167, 167));
        Panel_menu.setOpaque(false);
        Panel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_menuMouseExited(evt);
            }
        });
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setBackground(new java.awt.Color(37, 66, 70));
        btn1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(240, 240, 240));
        btn1.setText("Finanzas");
        btn1.setToolTipText("");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btn1.setBorderPainted(false);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 145, 70));

        btn3.setBackground(new java.awt.Color(37, 66, 70));
        btn3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(240, 240, 240));
        btn3.setText("Consultas");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btn3.setBorderPainted(false);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 145, 70));

        btn2.setBackground(new java.awt.Color(37, 66, 70));
        btn2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(240, 240, 240));
        btn2.setText("Registrar Alumno");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btn2.setBorderPainted(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 145, 70));

        btn4.setBackground(new java.awt.Color(37, 66, 70));
        btn4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(240, 240, 240));
        btn4.setText("Administrador");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        btn4.setBorderPainted(false);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 145, 70));

        Panel_principal.add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 420));

        Panel_fondo_menu.setBackground(new java.awt.Color(121, 162, 167));
        Panel_fondo_menu.setForeground(new java.awt.Color(121, 162, 167));
        Panel_fondo_menu.setOpaque(false);
        Panel_fondo_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_fondo_menuMouseExited(evt);
            }
        });
        Panel_fondo_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel_principal.add(Panel_fondo_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 570));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N
        Panel_principal.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 530, 560));

        getContentPane().add(Panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered
        // TODO add your handling code here:
        Panel_Menu_Finanzas.setVisible(true);
        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);

    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited
        // TODO add your handling code here:
        Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
        Panel_fondo_menu.setVisible(false);
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered
        // TODO add your handling code here:

        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited
        // TODO add your handling code here:

        Panel_menu.setVisible(false);
        Panel_fondo_menu.setVisible(false);
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered
        // TODO add your handling code here:
        Panel_Menu_Consultas.setVisible(true);
        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited
        Panel_Menu_Consultas.setVisible(false);

        Panel_menu.setVisible(false);

        Panel_fondo_menu.setVisible(false);
    }//GEN-LAST:event_btn3MouseExited

    private void Panel_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_menuMouseEntered
        // TODO add your handling code here:
        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);

    }//GEN-LAST:event_Panel_menuMouseEntered

    private void Panel_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_menuMouseExited
        // TODO add your handling code here:

        Panel_fondo_menu.setVisible(false);
        Panel_menu.setVisible(false);

    }//GEN-LAST:event_Panel_menuMouseExited

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
        // TODO add your handling code here:
        int velocidad = 1;
        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        Panel_fondo_menu.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //RegistrarAlumno obj = new RegistrarAlumno();
        //RegistrarDeuda obj = new RegistrarDeuda();
        RegistrarAlumno oj = new RegistrarAlumno(Acceso,idusuario);
        oj.setTitle("Registrar Alumno");
        oj.setLocationRelativeTo(null);
        oj.setVisible(true);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //Consultas con= new Consultas();
        //con.setTitle("Consultar pagos y alumnos");
        //con.setLocationRelativeTo(null);
        //con.setVisible(true);
    }//GEN-LAST:event_btn3ActionPerformed

    private void Panel_fondo_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_fondo_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_fondo_menuMouseExited

    private void btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseEntered
        Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);
        Panel_Menu_Admin.setVisible(true);
    }//GEN-LAST:event_btn4MouseEntered

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
        Panel_menu.setVisible(false);
        Panel_fondo_menu.setVisible(false);
        Panel_Menu_Admin.setVisible(false);
    }//GEN-LAST:event_btn4MouseExited

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

    }//GEN-LAST:event_btn4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setExtendedState(ICONIFIED);
        RegistrarPago regpag = new RegistrarPago(idusuario);
        regpag.setTitle("Registrar Pago");
        regpag.setLocationRelativeTo(null);
        regpag.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Panel_Menu_FinanzasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_FinanzasMouseEntered
        Panel_Menu_Finanzas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_Panel_Menu_FinanzasMouseEntered

    private void Panel_Menu_FinanzasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_FinanzasMouseExited
        Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_Panel_Menu_FinanzasMouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        Panel_Menu_Finanzas.setVisible(true);
        Panel_menu.setVisible(true);

    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        Panel_Menu_Finanzas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setExtendedState(ICONIFIED);
        RegistrarDeuda vdeuda = new RegistrarDeuda(idusuario);
        vdeuda.setTitle("Registrar Deuda");
        vdeuda.setLocationRelativeTo(null);
        vdeuda.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void Panel_Menu_ConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_ConsultasMouseEntered
        Panel_Menu_Consultas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_Panel_Menu_ConsultasMouseEntered

    private void Consulta_AlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consulta_AlumnoMouseEntered
        Panel_Menu_Consultas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_Consulta_AlumnoMouseEntered

    private void Consulta_DeudoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consulta_DeudoresMouseEntered
        Panel_Menu_Consultas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_Consulta_DeudoresMouseEntered

    private void Consutla_PagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consutla_PagoMouseEntered
        Panel_Menu_Consultas.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_Consutla_PagoMouseEntered

    private void Panel_Menu_ConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_ConsultasMouseExited
        Panel_Menu_Consultas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_Panel_Menu_ConsultasMouseExited

    private void Consulta_AlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consulta_AlumnoMouseExited
        Panel_Menu_Consultas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_Consulta_AlumnoMouseExited

    private void Consulta_DeudoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consulta_DeudoresMouseExited
        Panel_Menu_Consultas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_Consulta_DeudoresMouseExited

    private void Consutla_PagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consutla_PagoMouseExited
        Panel_Menu_Consultas.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_Consutla_PagoMouseExited

    private void Consulta_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_AlumnoActionPerformed
        cargar_mensualidad oj = new cargar_mensualidad();
        oj.cargar();
        Alumno obj = new Alumno(Acceso, idusuario);
        obj.setTitle("Consulta Alumno");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_Consulta_AlumnoActionPerformed
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void Panel_Menu_AdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_AdminMouseEntered
        Panel_menu.setVisible(true);
        Panel_Menu_Admin.setVisible(true);
    }//GEN-LAST:event_Panel_Menu_AdminMouseEntered

    private void btn_alta_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alta_usuariosMouseEntered
        Panel_Menu_Admin.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_btn_alta_usuariosMouseEntered

    private void btn_cons_movMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cons_movMouseEntered
        Panel_Menu_Admin.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_btn_cons_movMouseEntered

    private void Panel_Menu_AdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_AdminMouseExited
        Panel_Menu_Admin.setVisible(false);
        Panel_menu.setVisible(false);

    }//GEN-LAST:event_Panel_Menu_AdminMouseExited

    private void btn_alta_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alta_usuariosMouseExited
        Panel_Menu_Admin.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_btn_alta_usuariosMouseExited

    private void btn_cons_movMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cons_movMouseExited
        Panel_Menu_Admin.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_btn_cons_movMouseExited

    private void Consulta_DeudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consulta_DeudoresActionPerformed
        cargar_mensualidad oj = new cargar_mensualidad();
        oj.cargar();
        Consulta_Deudores obj = new Consulta_Deudores(idusuario);
        obj.setTitle("Consulta de alumnos con deuda");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);

    }//GEN-LAST:event_Consulta_DeudoresActionPerformed

    private void Consutla_PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consutla_PagoActionPerformed
        ConsultaPagos obj = new ConsultaPagos();
        obj.setTitle("Consulta de pagos");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_Consutla_PagoActionPerformed

    private void btn_alta_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alta_usuariosActionPerformed
        Usuarios obj = new Usuarios(Usuario,idusuario);
        obj.setTitle("Alta de Usuarios");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_btn_alta_usuariosActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        conn = ConexionSQL.conectar();
        String sentencia = "SELECT Id, Nombre, pasword ,estado , Nivel_Acceso from Usuario where Nombre = '" + usuario.getText() + "'";
        try {
            st = conn.prepareStatement(sentencia);
            rs = st.executeQuery();
            if (rs.next()) {
                if (rs.getString("estado").equals("Activo")) {
                    if (rs.getString("Nombre").equals(usuario.getText())) {
                        if (rs.getString("pasword").equals(psw.getText())) {
                            Usuario = rs.getString("Nombre");
                            panel_Login.setVisible(false);
                            error_usuario.setVisible(false);
                            error_psw.setVisible(false);
                            btnmenu.setVisible(true);
                            btn_cerrarsesion.setVisible(true);
                            Acceso = rs.getString("Nivel_Acceso");
                            idusuario = rs.getInt("Id");
                            if (Acceso.equals("Administrador")) {
                                btn4.setVisible(true);
                            } else {
                                btn4.setVisible(false);
                            }
                        } else {
                            error_usuario.setVisible(false);
                            error_psw.setVisible(true);
                        }
                    }else{
                        error_usuario.setVisible(true);
                    }
                }

            } else {
                error_usuario.setVisible(true);

            }
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesionActionPerformed
        usuario.setText("");
        psw.setText("");
        panel_Login.setVisible(true);
        btnmenu.setVisible(false);
        btn_cerrarsesion.setVisible(false);

    }//GEN-LAST:event_btn_cerrarsesionActionPerformed

    private void pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswActionPerformed

    private void btn_valoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_valoresMouseEntered
       Panel_Menu_Admin.setVisible(true);
        Panel_menu.setVisible(true);
    }//GEN-LAST:event_btn_valoresMouseEntered

    private void btn_valoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_valoresMouseExited
        Panel_Menu_Admin.setVisible(false);
        Panel_menu.setVisible(false);
    }//GEN-LAST:event_btn_valoresMouseExited

    private void btn_valoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valoresActionPerformed
        Variables_del_sistema obj = new Variables_del_sistema(idusuario);
        obj.setTitle("Sistema");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_btn_valoresActionPerformed

    private void btn_cons_movActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cons_movActionPerformed
        Consulta_Movimientos obj = new Consulta_Movimientos(idusuario);
        obj.setTitle("Movimientos");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_btn_cons_movActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal ventana = new Principal();
                ventana.setTitle("SISTEMA DE REGISTRO DE PAGO");
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consulta_Alumno;
    private javax.swing.JButton Consulta_Deudores;
    private javax.swing.JButton Consutla_Pago;
    private javax.swing.JPanel Panel_Menu_Admin;
    private javax.swing.JPanel Panel_Menu_Consultas;
    private javax.swing.JPanel Panel_Menu_Finanzas;
    private javax.swing.JPanel Panel_fondo_menu;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_alta_usuarios;
    private javax.swing.JButton btn_cerrarsesion;
    private javax.swing.JButton btn_cons_mov;
    private javax.swing.JButton btn_valores;
    private javax.swing.JButton btnmenu;
    private javax.swing.JLabel error_psw;
    private javax.swing.JLabel error_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panel_Login;
    private javax.swing.JPasswordField psw;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
