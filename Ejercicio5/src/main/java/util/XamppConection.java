package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class XamppConection {
    public static Connection getConnection() throws SQLException {
        String host = "127.0.0.1";
        String port = "3306";
        String database = "base_datos"; //nombre de BD
        String useSSL = "false";
        String timezone = "UTC";
        String url = String.format("jdbc:mysql://%s:%s/%s?useSSL=%s&serverTimezone=%s", host, port, database, useSSL, timezone);
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        return DriverManager.getConnection(url, "root", "");
    }


    public static void main(String[] args) {
        try {
            Connection con = getConnection();
            System.out.println("¡Conexion Exitosa!");
            con.close();
        } catch (SQLException e) {
            System.out.println("¡Conexion Fallida! " + e);
        }
    }
}