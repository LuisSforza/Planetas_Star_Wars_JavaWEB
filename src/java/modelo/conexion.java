
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class conexion {
    
    private Connection getConexion(){
        String ruta = "jdbc:mysql://localhost:3306/imperio_galáctico"; //Ruta de la base de datos local
        String usuario = "root"; //Usuario de la base de datos
        String password = "root";//Contraseña del usuario de la base de datos
        
        try{
            //Crear la conexion
            Connection miConexion = DriverManager.getConnection(ruta, usuario, password);
                    
            return miConexion;
            
        }catch(SQLException ex){
            
            System.out.print("Problema");
            ex.printStackTrace();
            return null;
        }
    }
    
    public List<Usuario> getAllUsuarios(){
        try{
            //Crear conexion
            
            Connection conexion = this.getConexion();
            Statement miStatement = conexion.createStatement();
            
            ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios");
            
            //Crear la lista de usuarios 
            List<Usuario> usuarios = new ArrayList<Usuario>();
            //leer el resultado
            while(miResultset.next()){
      
                Usuario user = new Usuario();
                user.user = miResultset.getString(1);
                user.name = miResultset.getString(2);
                user.password = miResultset.getString(3);
                usuarios.add(user);
            }
            conexion.close(); //Cierro la conexion
            miResultset.close(); //Cierro los resultados
            return usuarios;
        }catch(SQLException ex){
            System.out.print("Problema");
            return null;
        }
  
    }
    
}
