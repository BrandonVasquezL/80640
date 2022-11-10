package mx.uv.c80640;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexion{
    private static String url ="jdbc:mysql://localhost:3306/nombreBD";
    private static String DriverName = "com-mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "12345678";
    private static Connection connection = null;

    public static Connection geConnection(){
        try{
            Class.forName(DriverName);
            connection = DriverManager.getConnection(url, username, password).newInstance();
        }catch(SQLException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println("no encontro el driver");
        }
        return connection;
    }
}