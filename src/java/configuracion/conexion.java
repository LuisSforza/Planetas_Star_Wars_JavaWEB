package configuracion;

import java.sql.*;

public class conexion {
    Connection miConexion;    
    public conexion(){
        String ruta = "jdbc:mysql://localhost:3306/imperio_galáctico"; //Ruta de la base de datos local
        String usuario = "root"; //Usuario de la base de datos
        String password = "root";//Contraseña del usuario de la base de datos
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Crear la conexion
            miConexion = DriverManager.getConnection(ruta, usuario, password);                
        }catch(Exception ex){
            System.out.print("Problema de conexion");
            ex.printStackTrace();
        }
    }
    public Connection getConexion(){
       return miConexion;
    }
    
}
