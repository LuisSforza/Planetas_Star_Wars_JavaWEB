
package ModeloDAO;

import interfaces.CRUD;
import java.util.List;
import modelo.Usuario;
import configuracion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO implements CRUD {
    conexion conexionBD = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    @Override
    public List listar() {
       ArrayList<Usuario>list=new ArrayList<>();
       String sql ="SELECT * FROM usuarios";
       
       try{
            con = conexionBD.getConexion();
       
            ps = con.prepareStatement(sql);
       
            rs = ps.executeQuery();
            
            while(rs.next()){
                Usuario user = new Usuario();
                user.setUser(rs.getString("user"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                
                list.add(user);
            }
       }catch(Exception e){
           
       }
       return list;
       
    }

    @Override
    public Usuario list(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validacionUser(String user, String pass) {
        ArrayList<Usuario>list=new ArrayList<>();
        //String sql ="SELECT user, name FROM usuarios WHERE use ='"+user+"' AND password = '"+ pass +"';";
        String sql ="SELECT `user`, `password` FROM `usuarios` WHERE `user` = 'LUMA99' AND `password` = '1234';";
        try{
             con = conexionBD.getConexion();

             ps = con.prepareStatement(sql);

             rs = ps.executeQuery();
             
             if(rs.next()){
                if(rs.getString("user").equals(user.toString()) && rs.getString("password").equals(pass.toString())){
                     return true;
                 }                
             }
        }catch(Exception e){

        }
        return false;
    }
    
    
}
