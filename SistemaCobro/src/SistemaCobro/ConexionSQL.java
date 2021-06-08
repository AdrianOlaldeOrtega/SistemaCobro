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
            String user = "root";
            String password = "1234";
            connect = DriverManager.getConnection(url, user, password);
            if (connect != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("Conexion fallida");
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }
        return connect;
    }
}
