package SistemaCobro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class cargar_mensualidad {

    ConexionSQL conexion = new ConexionSQL();
    PreparedStatement st;
    ResultSet rs;
    ResultSet rs2;
    Statement stt;
    Statement stt2;
    Statement stt3;
    Connection conn;

    public void cargar() {
        boolean estado = false;

        try {
            Calendar fhoy = Calendar.getInstance();
            String hoy = "";
            
            conn = ConexionSQL.conectar();
            String query = "select NumeroControl, FechaInscripcion, beca from alumno";
            stt = conn.createStatement();
            stt3 = conn.createStatement();
            rs = stt.executeQuery(query);
            while (rs.next()) {
                int beca = Integer.parseInt(rs.getString(3));
                stt2 = conn.createStatement();
                query = "select no_control, Fecha from mensualidad_cargada where no_control = " + rs.getString(1);
                rs2 = stt2.executeQuery(query);
                if (rs2.next()) {
                    String fech2 = String.valueOf(rs2.getDate(2));
                    int anio = Integer.parseInt(fech2.substring(0, 4));
                    int mes = Integer.parseInt(fech2.substring(5, 7));
                    int dia = Integer.parseInt(fech2.substring(8, 10));
                    int meses = calculaMeses(dia, mes, anio);
                    System.out.println(fech2 + "cant meses " + meses);
                    query = "select * from variable";
                    rs2 = stt2.executeQuery(query);
                    rs2.next();
                    Double mens = rs2.getDouble(1);
                    Double total = meses * mens;
                    query = "SELECT Mensualidad,Saldo FROM deuda WHERE ALUMNO_NumeroControl = " + rs.getString(1);
                    rs2 = stt2.executeQuery(query);
                    if (meses != 0) {
                        if (rs2.next()) {
                            double deuda = rs2.getDouble(1);
                            double saldo = rs2.getDouble(2);
                            deuda = (total - ((total * Double.valueOf(beca)) / 100)) + deuda;
                            if (saldo != 0) {
                                deuda = deuda - saldo;
                                if (deuda < 0) {
                                    query = "update deuda set Mensualidad = 0, Saldo = " + (deuda * (-1)) + " where ALUMNO_NumeroControl = " + rs.getString(1);
                                } else {
                                    query = "update deuda set Mensualidad = " + deuda + ", Saldo = 0 where ALUMNO_NumeroControl = " + rs.getString(1);
                                }
                            } else {
                                query = "update deuda set Mensualidad = " + deuda + " where ALUMNO_NumeroControl = " + rs.getString(1);
                            }
                            System.out.println(deuda + " si entro");
                            stt3.executeUpdate(query);
                        } else {
                            query = "Insert into deuda (ALUMNO_NumeroControl,Libro,Inscripcion,Mensualidad,Certificacion,Saldo) values (?,?,?,?,?,?)";
                            st = conn.prepareStatement(query);
                            st.setInt(1, Integer.parseInt(rs.getString(1)));
                            st.setDouble(2, 0.0);
                            st.setDouble(3, 0.0);
                            st.setDouble(4, (total - ((total * Double.valueOf(beca)) / 100)));
                            st.setDouble(5, 0.0);
                            st.setDouble(6, 0.0);
                            st.executeUpdate();
                        }
                        hoy = String.valueOf(fhoy.get(Calendar.YEAR)) + "-" + String.valueOf((fhoy.get(Calendar.MONTH) + 1)) + "-" + String.valueOf(dia);
                        query = "update mensualidad_cargada set Fecha = '" + hoy + "' where no_control = " + rs.getString(1);
                        stt3.executeUpdate(query);
                    }

                } else {
                    String x = String.valueOf(rs.getDate(2));
                    query = "insert into mensualidad_cargada (no_control, Fecha) values (" + rs.getString(1) + ", '" + rs.getDate(2) + "')";
                    stt2.executeUpdate(query);
                    int anio = Integer.parseInt(x.substring(0, 4));
                    int mes = Integer.parseInt(x.substring(5, 7));
                    int dia = Integer.parseInt(x.substring(8, 10));
                    int meses = calculaMeses(dia, mes, anio);
                    query = "select * from variable";
                    rs2 = stt2.executeQuery(query);
                    rs2.next();
                    Double mens = rs2.getDouble(1);
                    Double total = meses * mens;
                    query = "SELECT Mensualidad,Saldo FROM deuda WHERE ALUMNO_NumeroControl = " + rs.getString(1);
                    rs2 = stt2.executeQuery(query);
                    if (meses != 0) {
                        if (rs2.next()) {
                            double deuda = rs2.getDouble(1);
                            double saldo = rs2.getDouble(2);
                            deuda = (total - ((total * Double.valueOf(beca)) / 100)) + deuda;
                            if (saldo != 0) {
                                deuda = deuda - saldo;
                                if (deuda < 0) {
                                    query = "update deuda set Mensualidad = 0, Saldo = " + (deuda * (-1)) + " where ALUMNO_NumeroControl = " + rs.getString(1);
                                } else {
                                    query = "update deuda set Mensualidad = " + deuda + ", Saldo = 0 where ALUMNO_NumeroControl = " + rs.getString(1);
                                }
                            } else {
                                query = "update deuda set Mensualidad = " + deuda + " where ALUMNO_NumeroControl = " + rs.getString(1);
                            }
                            stt3.executeUpdate(query);
                            hoy = String.valueOf(fhoy.get(Calendar.YEAR)) + "-" + String.valueOf((fhoy.get(Calendar.MONTH) + 1)) + "-" + String.valueOf(dia);
                            query = "update mensualidad_cargada set Fecha = '" + hoy + "' where no_control = " + rs.getString(1);
                            stt3.executeUpdate(query);
                        } else {
                            query = "Insert into deuda (ALUMNO_NumeroControl,Libro,Inscripcion,Mensualidad,Certificacion,Saldo) values (?,?,?,?,?,?)";
                            st = conn.prepareStatement(query);
                            st.setInt(1, Integer.parseInt(rs.getString(1)));
                            st.setDouble(2, 0.0);
                            st.setDouble(3, 0.0);
                            st.setDouble(4, (total - ((total * Double.valueOf(beca)) / 100)));
                            st.setDouble(5, 0.0);
                            st.setDouble(6, 0.0);
                            st.executeUpdate();
                            hoy = String.valueOf(fhoy.get(Calendar.YEAR)) + "-" + String.valueOf((fhoy.get(Calendar.MONTH) + 1)) + "-" + String.valueOf(dia);
                            query = "update mensualidad_cargada set Fecha = '" + hoy + "' where no_control = " + rs.getString(1);
                            stt3.executeUpdate(query);
                        }
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int calculaMeses(int dia, int mes, int anio) {

        Calendar inicio = Calendar.getInstance();
        inicio.set(anio, mes - 1, dia);

        Calendar actual = Calendar.getInstance();

        int anios_diferencia = calcularAnios(dia, mes, anio);
        int m = (actual.get(Calendar.MONTH) - inicio.get(Calendar.MONTH));
        int meses = 0;
        if (actual.get(Calendar.YEAR) == inicio.get(Calendar.YEAR)) {
            meses = actual.get(Calendar.MONTH) - inicio.get(Calendar.MONTH);
        } else {
            if (anios_diferencia == 0 && actual.get(Calendar.YEAR) != inicio.get(Calendar.YEAR)) {
                meses = (12 - inicio.get(Calendar.MONTH)) + actual.get(Calendar.MONTH);
            } else {
                meses = (anios_diferencia * 12) + (12 - inicio.get(Calendar.MONTH)) + actual.get(Calendar.MONTH);
            }
        }
        if (actual.get(Calendar.DATE) < dia) {
            meses--;
        }

        return meses;

    }

    public static int calcularAnios(int dia, int mes, int anio) {

        //seteamo el dia mes y año
        Calendar inicio = Calendar.getInstance();
        inicio.set(anio, mes - 1, dia);

        //Dia actual
        Calendar actual = Calendar.getInstance();

        //Calcula la diferencia de años
        int diferencia = actual.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        if (inicio.get(Calendar.DAY_OF_YEAR) > actual.get(Calendar.DAY_OF_YEAR)) {
            diferencia--;
        }

        return diferencia;

    }

}
