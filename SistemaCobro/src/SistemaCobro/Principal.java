package SistemaCobro;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.script.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

public class Principal extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("#.00000000");
    static int contador = 0;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Panel_fondo_menu.setVisible(false);
Panel_Menu_Finanzas.setVisible(false);
        Panel_menu.setVisible(false);
        Panel_Menu_Consultas.setVisible(false);
    
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_principal = new javax.swing.JPanel();
        btnmenu = new javax.swing.JButton();
        Panel_Menu_Consultas = new javax.swing.JPanel();
        Consutla_Pago = new javax.swing.JButton();
        Consulta_Alumno = new javax.swing.JButton();
        Consulta_Deudores = new javax.swing.JButton();
        Panel_Menu_Finanzas = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Panel_menu = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        Panel_fondo_menu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_principal.setBackground(new java.awt.Color(10, 31, 34));
        Panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_principal.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 10, 70, 70));

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
        Panel_Menu_Consultas.add(Consutla_Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 40));

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
        Panel_Menu_Consultas.add(Consulta_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 40));

        Consulta_Deudores.setText("Deudores");
        Consulta_Deudores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Consulta_DeudoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Consulta_DeudoresMouseExited(evt);
            }
        });
        Panel_Menu_Consultas.add(Consulta_Deudores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        Panel_principal.add(Panel_Menu_Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 140));

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
        Panel_Menu_Finanzas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 40));

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
        Panel_Menu_Finanzas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        Panel_principal.add(Panel_Menu_Finanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, -1));

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
        Panel_menu.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 70));

        btn3.setBackground(new java.awt.Color(37, 66, 70));
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
        Panel_menu.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 70));

        btn2.setBackground(new java.awt.Color(37, 66, 70));
        btn2.setForeground(new java.awt.Color(240, 240, 240));
        btn2.setText("Registrar alumno");
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
        Panel_menu.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 70));

        btn4.setBackground(new java.awt.Color(37, 66, 70));
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
        Panel_menu.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 343, 140, 70));

        Panel_principal.add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        Panel_fondo_menu.setBackground(new java.awt.Color(121, 162, 167));
        Panel_fondo_menu.setForeground(new java.awt.Color(121, 162, 167));
        Panel_fondo_menu.setOpaque(false);
        Panel_fondo_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_fondo_menuMouseExited(evt);
            }
        });
        Panel_fondo_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel_principal.add(Panel_fondo_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

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
        RegistrarAlumno oj = new RegistrarAlumno();
        RegistrarAlumno obj = new RegistrarAlumno();
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
    }//GEN-LAST:event_btn4MouseEntered

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited
         Panel_menu.setVisible(true);
        Panel_fondo_menu.setVisible(true);
    }//GEN-LAST:event_btn4MouseExited

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Usuarios us = new Usuarios();
        us.setTitle("Agregar/eliminar usuarios");
        us.setLocationRelativeTo(null);
        us.setVisible(true);
    }//GEN-LAST:event_btn4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistrarPago regpag = new RegistrarPago();
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
        RegistrarDeuda vdeuda = new RegistrarDeuda();
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
        Alumno obj = new Alumno();
        obj.setTitle("Consulta Alumno");
        obj.setLocationRelativeTo(null);
        obj.setVisible(true);
    }//GEN-LAST:event_Consulta_AlumnoActionPerformed
    

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
    private javax.swing.JPanel Panel_Menu_Consultas;
    private javax.swing.JPanel Panel_Menu_Finanzas;
    private javax.swing.JPanel Panel_fondo_menu;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
