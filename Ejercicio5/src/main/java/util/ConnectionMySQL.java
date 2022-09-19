package util;

//import com.mysql.jdbc.Driver; // ya no se usa este sino DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    public static Connection getConnection () throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // Aqui se usa lo del import en vez del new Driver()
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/basedatos", "root", "Gearsofwar2002");

        // url: jdbc://mysql://@ip:@puerto/@nombredebasededatos,@usuarios,@contraseña "jdbc:mysql://localhost:3306/basedatos", "root", "Gearsofwar2002"
        // "jdbc:mysql://Despues del nombre de base de datos jdbc:mysql://localhost:3306/basedatos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC" SIRVE PARA CORREGIR LA ZONA HORARIA
        //localhost = 127.0.0.1 es una direccion de ip local

    }

    //psvm = public static void main(String[] args){}
    public static void main(String[] args) {
        try {                       //intentar lo que este dentro del try
            Connection con = ConnectionMySQL.getConnection();
            System.out.println("Conexion exitosa");
        }catch (Exception e){       //cacha el error
            e.printStackTrace();
        }
    }
}
