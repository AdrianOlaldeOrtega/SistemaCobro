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
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Yamir Garcia
 */
public class RegistrarMovimiento {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    Statement stt;
    Connection conn;
    String Acceso = "";
    int Usuario;
    String desc = "";

    RegistrarMovimiento(int Usuario, String desc) {
        this.Usuario = Usuario;
        this.desc = desc;
        agregarmov();
    }

    public void agregarmov() {
        try {
            conn = ConexionSQL.conectar();
            Calendar fhoy = Calendar.getInstance();
            String hoy = String.valueOf(fhoy.get(Calendar.YEAR)) + "-" + String.valueOf((fhoy.get(Calendar.MONTH) + 1)) + "-" + String.valueOf(fhoy.get(Calendar.DATE));
                            
            String sentencia = "INSERT INTO movimientos (Id_Usuario,Descripcion,Fecha) values ('"+Usuario+"', '"+desc+"', '"+hoy+"')";
            stt = conn.createStatement();
            stt.executeUpdate(sentencia);
            stt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
