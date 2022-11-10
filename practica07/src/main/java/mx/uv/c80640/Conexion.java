package mx.uv.c80640;

import com.mysql.jdbc.Connection;

public class Conexion{
    private static String url ="jdbc:mysql://localhost:3306/nombreBD";
    private static String DriverName = "com-mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "12345678";
    private static Connection connection = null;

}