/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCobro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Yamir
 */
public class ConexionSQL {
    public static Connection conectar() {
        Connection connect = null;
        try {
            String url = "jdbc:mysql://localhost:3306/englishschoolprestige";
            //String user = JOptionPane.showInputDialog("Usuario");
            //String password = JOptionPane.showInputDialog("contraseña");
            connect = DriverManager.getConnection(url, "root", "yamir");
            if (connect != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("Conexion fallida");
            }

        } catch (SQLException ex) {
            System.out.println("no");

        }
        return connect;
    }
}
