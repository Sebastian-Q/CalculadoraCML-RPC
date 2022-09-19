package Controles;

import util.ConnectionMySQL;
import util.XamppConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
    Connection con;
    PreparedStatement pstm;

    String newRegister = "INSERT INTO bdCalculadora("+ //PONER UNA TABLA EN LA BASE DE DATOS
            "id, operacion, numero1, numero2, total, fecha) VALUE (?,?,?,?,?,?)";

    public datesCalculadora insertarDato(int id, String operacion, double num1, double num2, double total, String fecha){
        datesCalculadora dateCal = new datesCalculadora();
        try {
            //con = XamppConection.getConnection(); // CONEXION A XAMPP
            con  = ConnectionMySQL.getConnection(); // CoNEXION MYSQL
            pstm = con.prepareStatement(newRegister);
            pstm.setInt(1, id);
            pstm.setString(2, operacion);
            pstm.setDouble(3, num1);
            pstm.setDouble(4, num2);
            pstm.setDouble(5, total);
            pstm.setString(6, fecha);
            int resultado =pstm.executeUpdate();
            if (resultado == 1){
                dateCal.setId(id);
                dateCal.setOperacion(operacion);
                dateCal.setNum1(num1);
                dateCal.setNum2(num2);
                dateCal.setTotal(total);
                dateCal.setFecha(fecha);
            }else{
                dateCal = null;
            }
        } catch (SQLException e) {
            System.out.println("Error en el metodo datesCalculadora: " + e.getMessage());
        }finally {
            try {
                pstm.close();
                con.close();
            }catch (SQLException e){
                System.out.println("Error al cerrar las conexiones: " + e.getMessage());
            }
        }

        return dateCal;

    }
}
